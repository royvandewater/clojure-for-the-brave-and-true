(ns exercise-1.core)

(defn create
  "Create a new atom"
  []
  (atom {:value 0}))

(defn- increment-map-value
  "Increment the :value of a map"
  [a]
  (merge a {:value (inc (:value a))}))

(defn inc-value
  "Increment the value of an atomic element without mutation. Returns a new atom"
  [a]
  (atom (increment-map-value @a)))

(defn inc-value!
  "Increment the value of an atomic element in place"
  [a]
  (swap! a increment-map-value))
