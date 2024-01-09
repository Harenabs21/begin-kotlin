fun main() {
    val protocol = mutableSetOf("HTTP", "HTTPS", "FTP")
    protocol.add("SMTP")
    println(protocol)
    val other = "icmp"
    val isInProtocol = other.uppercase() in protocol
    println("Support for $other: $isInProtocol")
    protocol.remove("SMTP")
    println("The new list: $protocol")
}