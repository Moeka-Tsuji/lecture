/**
 * このプログラムの val information = ... で始まる登録情報の文字列修正して
 * あなたの情報に書き換えてから、このプログラムを実行して下さい。
 * 実行の出力にあなたの学籍情報等が正確に表示されることを確認できたら、
 * 修正したプログラムを ???@is.titech.ac.jp への添付メールとして提出しなさい。
 **/

object Register {
  /*
  val 登録情報 = """{
    "family": "あなたの姓に書き換えて下さい",
    "name":   "あなたの名に書き換えて下さい",
    "id":     "あなたの学籍番号に書き換えて下さい",
    "github": "あなたのGitHubアカウント名に書き換えて下さい",
    "login":  "あなたのログインIDに書き換えて下さい",
    "email":  "あなたの東工大メールのアドレスの@から左の部分に書き換えて下さい" }"""
  */
  val 登録情報 = Map(
    "family" -> "あなたの姓に書き換えて下さい",
    "name"   -> "あなたの名に書き換えて下さい",
    "id"     -> "あなたの学籍番号に書き換えて下さい",
    "github" -> "あなたのGitHubアカウント名に書き換えて下さい",
    "login"  -> "あなたのログインIDに書き換えて下さい",
    "email"  -> "あなたの東工大メールのアドレスの@から左の部分に書き換えて下さい")

  def main(arguments: Array[String]) {
    println(登録情報.values.mkString(","))
    /*
    println("\n\n----------------------------------------------------------------------")
    println(prettyRender(parse(登録情報)))
    println("----------------------------------------------------------------------\n\n")
    */
  }
}
