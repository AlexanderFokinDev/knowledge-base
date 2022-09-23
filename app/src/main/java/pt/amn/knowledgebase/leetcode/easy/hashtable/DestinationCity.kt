package pt.amn.knowledgebase.leetcode.easy.hashtable

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists
 * a direct path going from cityAi to cityBi. Return the destination city, that is,
 * the city without any path outgoing to another city.
 *
 * It is guaranteed that the graph of paths forms a line without any loop, therefore,
 * there will be exactly one destination city.
 */
class DestinationCity(private val paths: List<List<String>>) : Solution<String> {

    override fun getResult(): String {

        val cities = mutableMapOf<String, Int>()

        paths.forEach { root ->

            cities.put(root[0], 1)

            if (cities.contains(root[1])) {
                cities.put(root[1], 1)
            } else {
                cities.put(root[1], 0)
            }

        }

        val resultCity = cities.filter { city ->
            city.value == 0
        }

        return if (resultCity.size > 0) {
            resultCity.keys.first()
        } else {
            ""
        }
    }
}