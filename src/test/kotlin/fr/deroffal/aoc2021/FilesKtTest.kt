package fr.deroffal.aoc2021

import io.kotest.matchers.collections.shouldContainExactly
import org.junit.jupiter.api.Test

internal class FilesKtTest {

    @Test
    fun `fileToStrings returns file's content into a List of String`() {
        val expected = listOf(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque orci tortor, auctor quis purus sed, ullamcorper ornare odio. Aenean id porttitor nunc. Aliquam sodales nibh id nisl sagittis euismod. Maecenas vel blandit lacus, ac feugiat purus. Proin sed imperdiet arcu. Vestibulum nec molestie justo. Nunc et orci sit amet ante imperdiet scelerisque quis eu felis. Mauris diam enim, faucibus at placerat sit amet, dapibus a arcu. Phasellus interdum congue elit vitae venenatis. Morbi eleifend efficitur vestibulum. Integer iaculis nibh vel ipsum blandit congue. Phasellus ornare neque et sapien mollis lacinia. Suspendisse a justo vitae sapien dictum sagittis in porta ipsum. Vivamus sollicitudin nunc et dignissim accumsan. Sed aliquam urna et dui consectetur condimentum. Donec nulla mi, rhoncus id cursus sed, sagittis volutpat enim.",
            "Aliquam molestie magna nisi, quis porttitor nunc malesuada vitae. Fusce sed neque finibus, dignissim magna ac, eleifend ante. Vestibulum ultrices sapien eu tortor euismod, vitae congue nisi pulvinar. Vestibulum porta quam ut consequat aliquet. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nunc ullamcorper placerat varius. Sed suscipit est sed porta ultricies. Sed et velit a felis blandit efficitur. Cras congue ipsum ut dolor vulputate dignissim. Duis ornare neque quis faucibus condimentum. Cras pellentesque posuere elit, in tincidunt libero tempus lobortis. Cras euismod nisi a lectus molestie, vel scelerisque dolor blandit. Nam quis libero enim. Morbi et nibh sit amet erat rutrum viverra a sit amet erat. Ut eleifend, enim ac ornare lacinia, risus dui scelerisque erat, a accumsan ex nisl laoreet mi.",
            "Maecenas porttitor magna nec magna ornare, ac tincidunt libero dignissim. Duis posuere malesuada vestibulum. Aliquam cursus neque tincidunt, consequat magna condimentum, gravida velit. Fusce tristique lorem et mauris condimentum, fermentum suscipit risus rutrum. Fusce gravida ex vitae magna gravida, in tempor velit blandit. Aliquam bibendum est ut ligula ultricies volutpat. Suspendisse potenti. Pellentesque ac diam ligula. Pellentesque ac tellus fermentum, scelerisque odio eget, maximus justo. Sed suscipit blandit mauris vitae lobortis.",
            "Praesent ut nulla facilisis, lobortis nulla sollicitudin, tristique tellus. Phasellus mollis turpis sit amet metus aliquam tristique. Donec dictum finibus volutpat. Donec eu metus eu augue pulvinar consectetur. Nam id vulputate quam. Nam sit amet ultrices tellus, sit amet gravida nibh. Ut eleifend luctus mauris, a blandit lacus venenatis in. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Quisque odio elit, blandit eget ligula vitae, hendrerit feugiat tortor. Pellentesque facilisis quis mauris at hendrerit. Mauris at tincidunt elit, sed tempor libero. Vestibulum ac commodo nisl.",
            "Sed tristique tellus ac eros mollis, aliquet venenatis dolor mattis. Cras ut arcu justo. Phasellus suscipit hendrerit ultrices. Cras dui dolor, consectetur ac purus sed, viverra condimentum libero. Maecenas justo risus, feugiat a condimentum ac, fermentum in sapien. Duis aliquet, magna eu fermentum fringilla, eros urna rutrum nisl, egestas convallis ligula justo id lorem. Etiam ornare massa sed mauris molestie cursus ut sit amet eros. Vivamus quis posuere risus. Nullam et enim lectus. Proin a mattis arcu. Ut faucibus mauris arcu, vel vulputate mi vulputate in. Pellentesque dapibus dictum orci, sit amet maximus lacus interdum sodales."
        )

        "multi-lines.txt".fileToStrings() shouldContainExactly expected
    }

    @Test
    fun `fileToInts returns file's content into a List of Int`() {
        val expected = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)

        "numbers.txt".fileToInts() shouldContainExactly expected
    }

}
