(ns exercise-1.core)

(defmacro when-valid
  "Executes the function if the thing passes the condition"
  [thing condition f]
  `(if (~condition ~thing) (~f)))
