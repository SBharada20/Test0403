using System;
using System.Net.Http;
using System.Text.Json;
using System.Threading.Tasks;

class Program
{
    static async Task Main(string[] args)
    {
        // Web APIのエンドポイントURL
        string apiUrl = "https://jsonplaceholder.typicode.com/posts/1";

        // HttpClientのインスタンスを作成
        using (HttpClient client = new HttpClient())
        {
            try
            {
                // GETリクエストを送信
                HttpResponseMessage response = await client.GetAsync(apiUrl);

                // レスポンスが成功ステータスコードか確認
                if (response.IsSuccessStatusCode)
                {
                    // レスポンスの内容を文字列として取得
                    string responseBody = await response.Content.ReadAsStringAsync();

                    // JSONをオブジェクトにデシリアライズ
                    var post = JsonSerializer.Deserialize<Post>(responseBody);

                    // 結果を表示
                    Console.WriteLine($"ID: {post.Id}");
                    Console.WriteLine($"Title: {post.Title}");
                    Console.WriteLine($"Body: {post.Body}");
                }
                else
                {
                    Console.WriteLine($"エラー: {response.StatusCode}");
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine($"例外が発生しました: {ex.Message}");
            }
        }
    }
}

// レスポンスをマッピングするためのクラス
public class Post
{
    public int Id { get; set; }
    public string Title { get; set; }
    public string Body { get; set; }
}