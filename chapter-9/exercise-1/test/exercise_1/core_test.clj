(ns exercise-1.core-test
  (:require [clojure.test :refer :all]
            [exercise-1.core :refer :all]))

(deftest search-test
  (testing "when called with 'foo'."
    (is (not (nil? (search "foo"))))))
