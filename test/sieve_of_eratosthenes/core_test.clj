(ns sieve-of-eratosthenes.core-test
  (:require [clojure.test :refer :all]
            [sieve-of-eratosthenes.core :refer :all]))

(deftest test-sieve
  (testing "Sieve failed."
    (is (= (sieve 30) '(2 3 5 7 11 13 17 19 23 29)))))
