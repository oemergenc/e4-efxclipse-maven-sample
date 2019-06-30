
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage
import org.testfx.api.FxAssert
import org.testfx.api.FxToolkit
import org.testfx.framework.spock.ApplicationSpec
import org.testfx.matcher.control.LabeledMatchers
import spock.lang.Shared

/**
 * Simple test that pressed a Button and verifies that the text
 * is changed.
 */
class ApplicationStartSpec extends ApplicationSpec {

    @Shared
    Button button

    @Override
    void init() throws Exception {
        FxToolkit.registerStage { new Stage() }
    }

    @Override
    void start(Stage stage) {
        button = new Button('click me!')
        button.setOnAction { button.setText('clicked!') }
        stage.setScene(new Scene(new StackPane(button), 100, 100))
        stage.show()
    }

    @Override
    void stop() throws Exception {
        FxToolkit.hideStage()
    }

    def "should contain button"() {
        expect:
        //FxAssert.verifyThat('.button', LabeledMatchers.hasText ( 'click me!'))
        button.getText() == 'click me!'
    }

    def "should click on button"() {
        when:
        clickOn(".button")

        then:
        //FxAssert.verifyThat('.button', LabeledMatchers.hasText('clicked!'))
        button.getText() == 'clicked!'
    }

}
