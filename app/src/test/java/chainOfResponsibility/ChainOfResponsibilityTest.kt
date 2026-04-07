package chainOfResponsibility

import com.example.designpatternpractice.chainOfResponsibility.DoorStateError
import com.example.designpatternpractice.chainOfResponsibility.FinalErrorHandler
import com.example.designpatternpractice.chainOfResponsibility.NetworkError
import org.junit.Test

class ChainOfResponsibilityTest {

    @Test
    fun chainOfResponsibilityTest() {
        // チェーンを構築: DoorStateError → NetworkError → FinalErrorHandler
        // setNext は引数（次のハンドラ）を返すため、メソッドチェーンで連結できる
        // ※ handleError はチェーンの先頭（doorStateError）から呼び出す必要がある
        val doorStateError = DoorStateError()
        val networkError = NetworkError()
        doorStateError.setNext(networkError).setNext(FinalErrorHandler())

        val errorCode = 402  // NetworkError が担当する範囲
        doorStateError.handleError(errorCode)  // 先頭から処理を開始
    }
}