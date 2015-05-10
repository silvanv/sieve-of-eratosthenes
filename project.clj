(defproject sieve-of-eratosthenes "0.1.0-SNAPSHOT"
  :description "Get the prime numbers from 2 to `max` with the sieve of Eratosthenes algorithm.
                http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes"
  :url "http://silvanv.ch"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-beta2"]]
  :main ^:skip-aot sieve-of-eratosthenes.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
