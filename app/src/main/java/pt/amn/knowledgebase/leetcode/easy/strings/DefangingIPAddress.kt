package pt.amn.knowledgebase.leetcode.easy.strings

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 *
 * A defanged IP address replaces every period "." with "[.]".
 */
class DefangingIPAddress(private val address: String) : Solution<String> {

    override fun getResult(): String {

        return address.replace(".", "[.]")
    }
}