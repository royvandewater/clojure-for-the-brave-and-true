(ns exercise-1.core
  (:require [clj-http.client :as client]))

(defn- bing [query]
  (:body (client/get (str "https://www.bing.com/search?q=" query))))

(defn- google [query]
  (:body (client/get (str "https://www.google.com/search?q=" query))))

(defn search
  "Search both Google & Bing, return the first result"
  [query]
  (let [result (promise)]
    (future (deliver result (bing query)))
    (future (deliver result (google query)))
    @result))
