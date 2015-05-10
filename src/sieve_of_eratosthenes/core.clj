(ns sieve-of-eratosthenes.core
  (:gen-class))

(defn divisible-by?
  "Retun a function which tests if a number `n` is divisible by `d`"
  [d n]
  (not (= (mod n d) 0)))

(defn sieve
  "Get the prime numbers from 2 to `max` with the sieve of Eratosthenes algorithm."
  [max]
  (loop [coll (range 2 max)
         ret []]
    (let [head (first coll)
          f (partial divisible-by? head)]
      (if (< (count ret) (Math/sqrt max))
        (recur (filter f coll)
               (conj ret head))
        (concat ret coll)))))

(defn -main
  "Print all the prime numbers up to 100."
  [& args]
  (println (sieve 100)))
