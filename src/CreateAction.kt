import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.LangDataKeys
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.ui.Messages


/**
 * Created by yujichang on 2017/6/14.
 */
class CreateAction : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {

        val frame = MainFrame()
        val editor = event.getData(PlatformDataKeys.EDITOR)
        val project = editor?.project
        println(project?.name)
        val psiFile = event.getData(LangDataKeys.PSI_FILE)
        frame.setOnclickListener {
            val str = parseObject(psiFile?.name?.split(".")?.get(0) ?: "Parent", it)
            frame.isVisible = false
            if (str.isEmpty()) {
                Messages.showErrorDialog("输入的内容不是一个 JSON ！", "ERROR")
            } else {
                WriteCommandAction.runWriteCommandAction(project) {
                    editor?.document?.setText(str)
                }
            }
        }
        frame.isVisible = true
    }

}
