(ns sieve-of-eratosthenes.core
  (:gen-class))

(defn not-divisible-by?
  "Returns a function, which tests if a number `n` is not divisible by `d`"
  [d n]
  (> (mod n d) 0))

(defn sieve
  "Get the prime numbers from 2 to `max` with the sieve of Eratosthenes algorithm."
  [max]
  (loop [coll (range 2 max)
         ret []]
    (let [head (first coll)]
      (if (< (count ret) (Math/sqrt max))
        (recur (filter (partial not-divisible-by? head) coll)
               (conj ret head))
        (into ret coll)))))

(defn -main
  "Print all the prime numbers up to 100."
  [& args]
  (println (sieve 100)))
