(defproject org.clojars.oispa/ci-release-test "0.3.0"
  :description "Experiments with release automation"
  :url "https://github.com/miikka/ci-release-test"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :deploy-repositories [["releases" :clojars]]
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :profiles {:dev {:source-paths ["dev-src"]}})
