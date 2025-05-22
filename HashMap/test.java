public class test {
    public static void main(String[] args) {
        String urls = "https://www.google.com/search?q=url+shortener+test&oq=url+shortener+test&sourceid=chrome&ie=UTF-8\n" +
        "https://www.youtube.com/watch?v=dQw4w9WgXcQ&list=RDdQw4w9WgXcQ&start_radio=1\n" +
        "https://www.facebook.com/groups/123456789/posts/987654321/?comment_id=135792468&reply_comment_id=246813579\n" +
        "https://twitter.com/elonmusk/status/1234567890123456789?s=20&t=abcdefghijk\n" +
        "https://www.instagram.com/p/ABC123defGHI/?utm_source=ig_web_copy_link&hl=en\n" +
        "https://www.linkedin.com/jobs/view/1234567890/?alternateChannel=search&refId=abc123\n" +
        "https://www.reddit.com/r/technology/comments/abc123/this_is_a_test_post/?utm_source=share&utm_medium=web2x\n" +
        "https://en.wikipedia.org/wiki/URL_shortening#Security_issues_and_limitations\n" +
        "https://www.amazon.com/dp/B08N5KWB9H/ref=sr_1_1?keywords=test+product&qid=1234567890&sr=8-1\n" +
        "https://www.netflix.com/watch/12345678?trackId=98765432&tctx=xyz\n" +
        "https://open.spotify.com/track/4cOdK2wGLETKBW3PvgPWqT?si=abcdef1234567890\n" +
        "https://github.com/username/repository-name/pull/123/files?diff=split&w=1\n" +
        "https://stackoverflow.com/questions/12345678/how-to-test-a-url-shortener?noredirect=1&lq=1\n" +
        "https://medium.com/@testuser/how-to-build-a-url-shortener-in-2024-abcdef123456\n" +
        "https://www.nytimes.com/2024/01/01/us/politics/test-article.html?smid=url-share\n" +
        "https://www.bbc.com/news/world-europe-12345678?at_custom1=test&at_custom2=twitter\n" +
        "https://edition.cnn.com/2024/01/01/tech/url-shortener-testing/index.html?iref=urlshortener\n" +
        "https://www.aljazeera.com/news/2024/1/1/test-url-for-url-shortener?utm_source=test\n" +
        "https://www.ebay.com/itm/1234567890?hash=itemabc123def:g:XYZAAOSwXYZ123\n" +
        "https://www.apple.com/shop/product/ABC123/refurbished-macbook-pro-16-inch?afid=test\n" +
        "https://www.microsoft.com/en-us/store/p/test-product/9ABCDEF12345?cid=test\n" +
        "https://www.adobe.com/products/photoshop/free-trial-download.html?promoid=ABC123\n" +
        "https://www.dropbox.com/s/abc123def456/test-file.pdf?dl=0&raw=1\n" +
        "https://slack.com/intl/en-in/help/articles/1234567890-testing-urls?test=1\n" +
        "https://trello.com/c/ABC123/1-testing-url-shortener?filter=member\n" +
        "https://www.notion.so/Test-Page-1234567890abcdef1234567890abcdef\n" +
        "https://www.quora.com/What-is-the-best-URL-shortener-in-2024/answer/Test-User-123\n" +
        "https://www.pinterest.com/pin/123456789012345678/feed/?test=1\n" +
        "https://www.tumblr.com/test-blog/1234567890/test-post?source=share\n" +
        "https://www.flickr.com/photos/testuser/12345678901/in/album-1234567890/\n" +
        "https://imgur.com/gallery/ABC123DEF?utm_source=test\n" +
        "https://www.deviantart.com/testuser/art/Test-Art-1234567890\n" +
        "https://www.twitch.tv/teststreamer/clip/ABC123?filter=clips&range=7d\n" +
        "https://discord.com/channels/1234567890/987654321/123456789012345678\n" +
        "https://soundcloud.com/test-user/test-song-2024?si=abc123\n" +
        "https://vimeo.com/123456789?autoplay=1&loop=1&test=1\n" +
        "https://www.dailymotion.com/video/abc123def?playlist=xyz456\n" +
        "https://www.udemy.com/course/test-course/learn/lecture/12345678?start=0\n" +
        "https://www.coursera.org/learn/test-course/home/week/1?test=1\n" +
        "https://www.khanacademy.org/math/test-course/test-unit/test-lesson/test-topic/a/test-quiz\n" +
        "https://www.ted.com/talks/test_speaker_test_topic?language=en&test=1\n" +
        "https://www.codecademy.com/learn/test-path/modules/test-module/cheatsheet\n" +
        "https://www.freecodecamp.org/learn/test-certification/test-project/?test=1\n" +
        "https://www.w3schools.com/html/html_links.asp?test=1&color=123456\n" +
        "https://www.mozilla.org/en-US/firefox/new/?test=1&xv=test\n" +
        "https://www.apache.org/licenses/LICENSE-2.0.html?test=1\n" +
        "https://www.python.org/downloads/release/python-12345/?test=1\n" +
        "https://nodejs.org/dist/v12.18.3/docs/api/test.html?test=1\n" +
        "https://reactjs.org/docs/test-api.html?test=1\n" +
        "https://vuejs.org/v2/guide/test.html?test=1\n" +
        "https://angular.io/guide/test?test=1\n" +
        "https://www.docker.com/products/docker-desktop/?test=1\n" +
        "https://kubernetes.io/docs/tutorials/test-tutorial/?test=1\n" +
        "https://www.nginx.com/resources/wiki/start/topics/test/?test=1\n" +
        "https://letsencrypt.org/getting-started/?test=1\n" +
        "https://www.cloudflare.com/learning/ddos/test-page/?test=1\n" +
        "https://www.digitalocean.com/community/tutorials/test-tutorial?test=1\n" +
        "https://www.heroku.com/pricing/?test=1\n" +
        "https://aws.amazon.com/s3/pricing/?test=1\n" +
        "https://azure.microsoft.com/en-us/pricing/details/test/?test=1\n" +
        "https://cloud.google.com/functions/pricing?test=1\n" +
        "https://www.ibm.com/cloud/free/?test=1\n" +
        "https://www.oracle.com/cloud/free/?test=1\n" +
        "https://www.alibabacloud.com/product/test?test=1\n" +
        "https://wordpress.org/plugins/test-plugin/?test=1\n" +
        "https://www.shopify.com/pricing?test=1\n" +
        "https://www.squarespace.com/pricing?test=1\n" +
        "https://www.weebly.com/pricing?test=1\n" +
        "https://www.wix.com/upgrade/website?test=1\n" +
        "https://www.blogger.com/about/?test=1\n" +
        "https://www.medium.com/m/signin?test=1\n" +
        "https://www.substack.com/signin?test=1\n" +
        "https://www.patreon.com/join/testcreator?test=1\n" +
        "https://www.kickstarter.com/projects/test/test-project?test=1\n" +
        "https://www.indiegogo.com/projects/test-project?test=1\n" +
        "https://www.producthunt.com/products/test-product?test=1\n" +
        "https://news.ycombinator.com/item?id=12345678?test=1\n" +
        "https://lobste.rs/s/abc123/test_post?test=1\n" +
        "https://www.theverge.com/2024/1/1/12345678/test-article?test=1\n" +
        "https://techcrunch.com/2024/01/01/test-article?test=1\n" +
        "https://www.wired.com/story/test-article?test=1\n" +
        "https://www.engadget.com/test-article?test=1\n" +
        "https://www.gizmodo.com/test-article?test=1\n" +
        "https://www.mashable.com/test-article?test=1\n" +
        "https://www.cnet.com/news/test-article?test=1\n" +
        "https://www.zdnet.com/article/test-article?test=1\n" +
        "https://www.ars-technica.com/test-article?test=1\n" +
        "https://www.anandtech.com/show/12345/test-article?test=1\n" +
        "https://www.tomshardware.com/news/test-article?test=1\n" +
        "https://www.pcmag.com/reviews/test-review?test=1\n" +
        "https://www.howtogeek.com/123456/test-article?test=1\n" +
        "https://www.lifehacker.com/test-article?test=1\n" +
        "https://www.makeuseof.com/test-article?test=1\n" +
        "https://www.xda-developers.com/test-article?test=1\n" +
        "https://www.androidcentral.com/test-article?test=1\n" +
        "https://www.macrumors.com/test-article?test=1\n" +
        "https://www.9to5mac.com/test-article?test=1\n" +
        "https://www.theguardian.com/world/2024/jan/01/test-article?test=1\n" +
        "https://www.reuters.com/world/test-article?test=1\n" +
        "https://www.bloomberg.com/news/articles/2024-01-01/test-article?test=1\n" +
        "https://example.com/path/to/resource?param1=value1&param2=value2&param3=value3&param4=value4&param5=value5&param6=value6&param7=value7&param8=value8&param9=value9&param10=value10\n" +
        "https://subdomain.example.com/another/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://www.test.com/this/is/a/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://api.example.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321/likes/54321?filter=recent&limit=100&offset=0&sort=desc&include=user,post,comment,reply\n" +
        "https://test.example.org/path/to/resource?id=1234567890abcdef1234567890abcdef&token=abcdef1234567890abcdef1234567890&expires=1234567890&signature=abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890\n" +
        "https://www.test-url-1.com/long/path/with/many/segments?param1=value1&param2=value2&param3=value3\n" +
        "https://www.test-url-2.com/another/long/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://www.test-url-3.com/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://api.test-url-4.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321/likes/54321?filter=recent&limit=100&offset=0&sort=desc&include=user,post,comment,reply\n" +
        "https://test-url-5.example.org/path/to/resource?id=1234567890abcdef1234567890abcdef&token=abcdef1234567890abcdef1234567890&expires=1234567890&signature=abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890\n" +
        "https://www.test-url-6.com/long/path/with/many/segments?param1=value1&param2=value2&param3=value3\n" +
        "https://www.test-url-7.com/another/long/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://www.test-url-8.com/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://api.test-url-9.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321/likes/54321?filter=recent&limit=100&offset=0&sort=desc&include=user,post,comment,reply\n" +
        "https://test-url-10.example.org/path/to/resource?id=1234567890abcdef1234567890abcdef&token=abcdef1234567890abcdef1234567890&expires=1234567890&signature=abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890\n" +
        "https://www.test-url-11.com/long/path/with/many/segments?param1=value1&param2=value2&param3=value3\n" +
        "https://www.test-url-12.com/another/long/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://www.test-url-13.com/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://api.test-url-14.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321/likes/54321?filter=recent&limit=100&offset=0&sort=desc&include=user,post,comment,reply\n" +
        "https://test-url-15.example.org/path/to/resource?id=1234567890abcdef1234567890abcdef&token=abcdef1234567890abcdef1234567890&expires=1234567890&signature=abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890\n" +
        "https://www.test-url-16.com/long/path/with/many/segments?param1=value1&param2=value2&param3=value3\n" +
        "https://www.test-url-17.com/another/long/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://www.test-url-18.com/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://api.test-url-19.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321/likes/54321?filter=recent&limit=100&offset=0&sort=desc&include=user,post,comment,reply\n" +
        "https://test-url-20.example.org/path/to/resource?id=1234567890abcdef1234567890abcdef&token=abcdef1234567890abcdef1234567890&expires=1234567890&signature=abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890\n" +
        "https://www.test-url-21.com/long/path/with/many/segments?param1=value1&param2=value2&param3=value3\n" +
        "https://www.test-url-22.com/another/long/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://www.test-url-23.com/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://api.test-url-24.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321/likes/54321?filter=recent&limit=100&offset=0&sort=desc&include=user,post,comment,reply\n" +
        "https://test-url-25.example.org/path/to/resource?id=1234567890abcdef1234567890abcdef&token=abcdef1234567890abcdef1234567890&expires=1234567890&signature=abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890\n" +
        "https://www.test-url-26.com/long/path/with/many/segments?param1=value1&param2=value2&param3=value3\n" +
        "https://www.test-url-27.com/another/long/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://www.test-url-28.com/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://api.test-url-29.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321/likes/54321?filter=recent&limit=100&offset=0&sort=desc&include=user,post,comment,reply\n" +
        "https://test-url-30.example.org/path/to/resource?id=1234567890abcdef1234567890abcdef&token=abcdef1234567890abcdef1234567890&expires=1234567890&signature=abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890\n" +
        "https://www.test-url-31.com/long/path/with/many/segments?param1=value1&param2=value2&param3=value3\n" +
        "https://www.test-url-32.com/another/long/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://www.test-url-33.com/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://api.test-url-34.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321/likes/54321?filter=recent&limit=100&offset=0&sort=desc&include=user,post,comment,reply\n" +
        "https://test-url-35.example.org/path/to/resource?id=1234567890abcdef1234567890abcdef&token=abcdef1234567890abcdef1234567890&expires=1234567890&signature=abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890\n" +
        "https://www.test-url-36.com/long/path/with/many/segments?param1=value1&param2=value2&param3=value3\n" +
        "https://www.test-url-37.com/another/long/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://www.test-url-38.com/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://api.test-url-39.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321/likes/54321?filter=recent&limit=100&offset=0&sort=desc&include=user,post,comment,reply\n" +
        "https://test-url-40.example.org/path/to/resource?id=1234567890abcdef1234567890abcdef&token=abcdef1234567890abcdef1234567890&expires=1234567890&signature=abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890\n" +
        "https://www.test-url-41.com/long/path/with/many/segments?param1=value1&param2=value2&param3=value3\n" +
        "https://www.test-url-42.com/another/long/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://www.test-url-43.com/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://api.test-url-44.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321/likes/54321?filter=recent&limit=100&offset=0&sort=desc&include=user,post,comment,reply\n" +
        "https://test-url-45.example.org/path/to/resource?id=1234567890abcdef1234567890abcdef&token=abcdef1234567890abcdef1234567890&expires=1234567890&signature=abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890\n" +
        "https://www.test-url-46.com/long/path/with/many/segments?param1=value1&param2=value2&param3=value3\n" +
        "https://www.test-url-47.com/another/long/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://www.test-url-48.com/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://api.test-url-49.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321/likes/54321?filter=recent&limit=100&offset=0&sort=desc&include=user,post,comment,reply\n" +
        "https://test-url-50.example.org/path/to/resource?id=1234567890abcdef1234567890abcdef&token=abcdef1234567890abcdef1234567890&expires=1234567890&signature=abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890\n" +
        "https://www.test-url-51.com/long/path/with/many/segments?param1=value1&param2=value2&param3=value3\n" +
        "https://www.test-url-52.com/another/long/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://www.test-url-53.com/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://api.test-url-54.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321/likes/54321?filter=recent&limit=100&offset=0&sort=desc&include=user,post,comment,reply\n" +
        "https://test-url-55.example.org/path/to/resource?id=1234567890abcdef1234567890abcdef&token=abcdef1234567890abcdef1234567890&expires=1234567890&signature=abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890\n" +
        "https://www.test-url-56.com/long/path/with/many/segments?param1=value1&param2=value2&param3=value3\n" +
        "https://www.test-url-57.com/another/long/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://www.test-url-58.com/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://api.test-url-59.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321/likes/54321?filter=recent&limit=100&offset=0&sort=desc&include=user,post,comment,reply\n" +
        "https://test-url-60.example.org/path/to/resource?id=1234567890abcdef1234567890abcdef&token=abcdef1234567890abcdef1234567890&expires=1234567890&signature=abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890\n" +
        "https://www.test-url-61.com/long/path/with/many/segments?param1=value1&param2=value2&param3=value3\n" +
        "https://www.test-url-62.com/another/long/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://www.test-url-63.com/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://api.test-url-64.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321/likes/54321?filter=recent&limit=100&offset=0&sort=desc&include=user,post,comment,reply\n" +
        "https://test-url-65.example.org/path/to/resource?id=1234567890abcdef1234567890abcdef&token=abcdef1234567890abcdef1234567890&expires=1234567890&signature=abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890\n" +
        "https://www.test-url-66.com/long/path/with/many/segments?param1=value1&param2=value2&param3=value3\n" +
        "https://www.test-url-67.com/another/long/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://www.test-url-68.com/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://api.test-url-69.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321/likes/54321?filter=recent&limit=100&offset=0&sort=desc&include=user,post,comment,reply\n" +
        "https://test-url-70.example.org/path/to/resource?id=1234567890abcdef1234567890abcdef&token=abcdef1234567890abcdef1234567890&expires=1234567890&signature=abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890\n" +
        "https://www.test-url-71.com/long/path/with/many/segments?param1=value1&param2=value2&param3=value3\n" +
        "https://www.test-url-72.com/another/long/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://www.test-url-73.com/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://api.test-url-74.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321/likes/54321?filter=recent&limit=100&offset=0&sort=desc&include=user,post,comment,reply\n" +
        "https://test-url-75.example.org/path/to/resource?id=1234567890abcdef1234567890abcdef&token=abcdef1234567890abcdef1234567890&expires=1234567890&signature=abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890\n" +
        "https://www.test-url-76.com/long/path/with/many/segments?param1=value1&param2=value2&param3=value3\n" +
        "https://www.test-url-77.com/another/long/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://www.test-url-78.com/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://api.test-url-79.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321/likes/54321?filter=recent&limit=100&offset=0&sort=desc&include=user,post,comment,reply\n" +
        "https://test-url-80.example.org/path/to/resource?id=1234567890abcdef1234567890abcdef&token=abcdef1234567890abcdef1234567890&expires=1234567890&signature=abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890\n" +
        "https://www.test-url-81.com/long/path/with/many/segments?param1=value1&param2=value2&param3=value3\n" +
        "https://www.test-url-82.com/another/long/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://www.test-url-83.com/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
        "https://api.test-url-84.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321\n" + 
        "https://www.google.com\n" +
        "https://www.youtube.com\n" +
        "https://www.facebook.com\n" +
        "https://www.twitter.com\n" +
        "https://www.instagram.com\n" +
        "https://www.linkedin.com\n" +
        "https://www.reddit.com\n" +
        "https://www.wikipedia.org\n" +
        "https://www.amazon.com\n" +
        "https://www.netflix.com\n" +
        "https://www.spotify.com\n" +
        "https://www.github.com\n" +
        "https://www.stackoverflow.com\n" +
        "https://www.medium.com\n" +
        "https://www.nytimes.com\n" +
        "https://www.bbc.com\n" +
        "https://www.cnn.com\n" +
        "https://www.aljazeera.com\n" +
        "https://www.ebay.com\n" +
        "https://www.apple.com\n" +
        "https://www.microsoft.com\n" +
        "https://www.adobe.com\n" +
        "https://www.dropbox.com\n" +
        "https://www.slack.com\n" +
        "https://www.trello.com\n" +
        "https://www.notion.so\n" +
        "https://www.quora.com\n" +
        "https://www.pinterest.com\n" +
        "https://www.tumblr.com\n" +
        "https://www.flickr.com\n" +
        "https://www.imgur.com\n" +
        "https://www.deviantart.com\n" +
        "https://www.twitch.tv\n" +
        "https://www.discord.com\n" +
        "https://www.soundcloud.com\n" +
        "https://www.vimeo.com\n" +
        "https://www.dailymotion.com\n" +
        "https://www.udemy.com\n" +
        "https://www.coursera.org\n" +
        "https://www.khanacademy.org\n" +
        "https://www.ted.com\n" +
        "https://www.codecademy.com\n" +
        "https://www.freecodecamp.org\n" +
        "https://www.w3schools.com\n" +
        "https://www.mozilla.org\n" +
        "https://www.apache.org\n" +
        "https://www.python.org\n" +
        "https://www.nodejs.org\n" +
        "https://www.reactjs.org\n" +
        "https://www.vuejs.org\n" +
        "https://www.angular.io\n" +
        "https://www.docker.com\n" +
        "https://www.kubernetes.io\n" +
        "https://www.nginx.com\n" +
        "https://www.letsencrypt.org\n" +
        "https://www.cloudflare.com\n" +
        "https://www.digitalocean.com\n" +
        "https://www.heroku.com\n" +
        "https://www.aws.amazon.com\n" +
        "https://www.microsoft.com/azure\n" +
        "https://www.google.com/cloud\n" +
        "https://www.ibm.com/cloud\n" +
        "https://www.oracle.com/cloud\n" +
        "https://www.alibabacloud.com\n" +
        "https://www.wordpress.org\n" +
        "https://www.shopify.com\n" +
        "https://www.squarespace.com\n" +
        "https://www.weebly.com\n" +
        "https://www.wix.com\n" +
        "https://www.blogger.com\n" +
        "https://www.medium.com\n" +
        "https://www.substack.com\n" +
        "https://www.patreon.com\n" +
        "https://www.kickstarter.com\n" +
        "https://www.indiegogo.com\n" +
        "https://www.producthunt.com\n" +
        "https://www.hackernews.com\n" +
        "https://www.lobste.rs\n" +
        "https://www.theverge.com\n" +
        "https://www.techcrunch.com\n" +
        "https://www.wired.com\n" +
        "https://www.engadget.com\n" +
        "https://www.gizmodo.com\n" +
        "https://www.mashable.com\n" +
        "https://www.cnet.com\n" +
        "https://www.zdnet.com\n" +
        "https://www.ars-technica.com\n" +
        "https://www.anandtech.com\n" +
        "https://www.tomshardware.com\n" +
        "https://www.pcmag.com\n" +
        "https://www.howtogeek.com\n" +
        "https://www.lifehacker.com\n" +
        "https://www.makeuseof.com\n" +
        "https://www.xda-developers.com\n" +
        "https://www.androidcentral.com\n" +
        "https://www.macrumors.com\n" +
        "https://www.9to5mac.com\n" +
        "https://www.theguardian.com\n" +
        "https://www.reuters.com\n" +
        "https://www.bloomberg.com\n"+
        "https://www.google.com/search?q=url+shortener+test&oq=url+shortener+test&sourceid=chrome&ie=UTF-8\n"+
        "https://en.wikipedia.org/wiki/Hash_function?oldformat=true&redirect=no&view=full\n"+
        "https://www.amazon.com/gp/product/B08N5WRWNW/ref=ppx_yo_dt_b_search_asin_title?ie=UTF8&psc=1\n"+
        "https://news.ycombinator.com/item?id=34567890&ref=homepage&sort=top&timeframe=week\n"+
        "https://www.reddit.com/r/programming/comments/abc123/test_your_url_shortener_with_these_cases/?utm_source=share&utm_medium=web2x\n"+
        "https://stackoverflow.com/questions/12345678/how-do-i-test-my-url-shortener-hash-function-properly?rq=1\n"+
        "https://www.youtube.com/watch?v=dQw4w9WgXcQ&ab_channel=RickAstleyVEVO&feature=youtu.be\n"+
        "https://www.nytimes.com/2023/08/01/technology/url-shortening-services-security.html?searchResultPosition=2\n"+
        "https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/URLSearchParams?utm_campaign=mdn-js\n"+
        "https://openai.com/blog/chatgpt-plugins?utm_source=newsletter&utm_medium=email&utm_campaign=release_notes\n"+
        "https://arxiv.org/abs/2106.04554?context=cs.LG&download=false\n"+
        "https://github.com/user/project/blob/main/src/utils/hashFunctionTester.js?line=24\n"+
        "https://www.coursera.org/learn/algorithms-part1/home/week/3?progress=1Y5ak\n"+
        "https://www.python.org/dev/peps/pep-0008/#code-lay-out?utm_ref=hash_demo\n"+
        "https://www.imdb.com/title/tt4154796/?ref_=nv_sr_srsg_0_tt_8_nm_0_q_avengers%20end\n"+
        "https://www.bbc.com/news/world-us-canada-67200000?utm_term=breaking&utm_medium=social&utm_source=twitter\n"+
        "https://www.ted.com/talks/susan_cain_the_power_of_introverts?language=en&referrer=playlist-ted_talks_every_introvert_should_watch\n"+
        "https://edition.cnn.com/2025/04/29/tech/url-shortener-study/index.html?utm_campaign=article_share\n"+
        "https://www.linkedin.com/in/johndoe123/details/projects/1234567890123456789/\n"+
        "https://www.apple.com/shop/product/MT1K3AM/A/magsafe-charger?fnode=7e&fs=f%3Diphone&fh=4589%2B47d3\n"+
        "https://developer.chrome.com/docs/extensions/mv3/getstarted/?utm_source=devtools&utm_medium=console&utm_campaign=mv3\n"+
        "https://www.kaggle.com/code/username/url-shortener-test-hashing/edit/run/987654321\n"+
        "https://www.sciencedirect.com/science/article/pii/S0167739X21004026?via%3Dihub\n"+
        "https://www.tripadvisor.com/Hotel_Review-g60763-d93555-Reviews-Park_Central_Hotel_New_York-New_York_City_New_York.html\n"+
        "https://www.zoom.us/webinar/register/1234567890123/WN_abcXYZTest_Link&utm_campaign=invite\n"+
        "https://www.netflix.com/watch/80057281?trackId=14170286&tctx=0%2C1%2C5a3d3109-500a-4657-8af7-cbba8247a3ab-20732709%2Cda53c38b-3f21-4e32-8a83-4a1a8bb5bcdf_31289293X3XX1703241350081\n"+
        "https://www.spotify.com/us/artist/4NHQUGzhtTLFvgF5SZesLK?si=abc123&dl_branch=1\n"+
        "https://www.airbnb.com/rooms/12345678?check_in=2025-06-01&check_out=2025-06-05&guests=2&adults=2&s=67&unique_share_id=a0b1c2d3\n"+
        "https://www.twitch.tv/videos/1234567890?filter=archives&sort=time\n"+
        "https://developer.android.com/studio/preview/features?utm_source=android-studio\n"+
        "https://portal.azure.com/#view/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/~/Overview\n"+
        "https://www.udemy.com/course/learn-java-the-complete-java-developer-course/?couponCode=JAVA25OFFSPRING\n"+
        "https://support.microsoft.com/en-us/topic/fix-windows-update-error-0x800f0831-dc57a70c-4d3c-6cf9-013d-80ac5fefdd99\n"+
        "https://console.cloud.google.com/apis/library?project=my-url-project&supportedpurview=project\n"+
        "https://www.ibm.com/docs/en/cloud-pak-data/4.6.x?topic=overview-url-shortener-api\n"+
        "https://gitlab.com/username/repo/-/blob/main/utils/test_urls_long.java?ref_type=heads\n"+
        "https://www.mozilla.org/en-US/firefox/new/?utm_source=google&utm_medium=cpc&utm_campaign=firefox-general\n"+
        "https://www.dropbox.com/scl/fo/some-shared-id/path/to/folder?dl=0&rlkey=abcdefg1234567\n"+
        "https://calendar.google.com/calendar/u/0/r/eventedit?text=Test+URL+Hashing&dates=20250601T170000Z/20250601T180000Z\n"+
        "https://accounts.google.com/o/oauth2/v2/auth?client_id=1234567890&redirect_uri=https%3A%2F%2Fexample.com%2Fcallback&scope=email&response_type=code\n"+
        "https://shopify.dev/docs/api/admin-rest/2024-01/resources/redirect?utm_source=devdocs\n"+
        "https://www.heroku.com/pricing?ref=footer&utm_medium=redirect&utm_source=homepage&utm_campaign=pricing\n"+
        "https://gist.github.com/exampleuser/5b8d6b1234d123456789abcdef012345#file-url-hashing-tests-md\n"+
        "https://www.figma.com/file/123abc456def/URL-Shortener-Wireframe?node-id=101-23&t=abcXYZ123456789\n"+
        "https://figshare.com/articles/dataset/URL_Shortener_Test_Data/12345678/1\n"+
        "https://www.oracle.com/java/technologies/javase-downloads.html?locale=en&hash=test-case\n"+
        "https://mybinder.org/v2/gh/username/url-shortener-test-notebook/HEAD?filepath=URL_Test_Hashing.ipynb\n"+
        "https://codepen.io/anon/pen/abcXYZ123?editors=1010&preview=true\n"+
        "https://www.jetbrains.com/help/idea/run-debug-configuration.html#hash-tracking\n"+
        "https://firebase.google.com/docs/dynamic-links/use-cases?platform=android\n"+
        "https://learn.microsoft.com/en-us/aspnet/core/fundamentals/url-rewriting?view=aspnetcore-7.0\n" +
        "http://223.255.255.254" + "https://www.example.com/very/long/path/to/a/resource/with/many/subdirectories/and/a/very/descriptive/filename.html?param1=value1\\&param2=anotherlongvalue\\&param3=yetanother\n" +
"https://images.google.com/search?q=very+long+search+term+with+many+words+that+makes+the+url+incredibly+long\\&tbm=isch\\&ved=2ahUKEwixtL76-oH6AhVlrmoFHX-uD-MQ2-cCegQIABAA\\&oq=very+long+search+term+with+many+words+that+makes+the+url+incredibly+long\\&gs_lcp=CgNpbWcQA1AAWLoOYLYPaABwAHgAgAGIAYgBkgEBMZgBAKABAaoBC2ltYWdlcyABCsABAQ\\&sclient=img\\&ei=jX-tYv-0L8vWqtsP_720oAM\\&bih=761\\&biw=1536\n" +
"https://www.youtube.com/watch?v=abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-\n" +
"https://thisisanextremelylongdomainnamethatexceedsallreasonableexpectationsandshouldneverbeusedintherealworld.com/another/very/deeply/nested/directory/structure/leading/to/a/specific/and/uniquely/identified/content/page.php\n" +
"https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY\\&date=2023-03-15\\&concept_tags=True\\&thumbs=True\\&explanation=True\\&hd=True\\&media_type=image\n" +
"https://www.amazon.com/Long-Product-Title-That-Goes-On-For-Several-Lines-And-Includes-Many-Keywords-To-Improve-Search-Engine-Optimization/dp/B012345678/ref=sr_1_1_sspa?crid=ABCDEFGHIJKLMNOPQRSTUV\\&keywords=long+product+name\\&qid=1678886400\\&sprefix=long+product+name%2Caps%2C123\\&sr=8-1-spons\\&psc=1\\&smid=A12BCD3EFGHIJ\n" +
"https://www.theguardian.com/world/2023/mar/16/ukraine-war-latest-news-russia-invasion-live-updates-zelensky-putin-peace-talks-nato-biden-china-europe-un\n" +
"https://en.wikipedia.org/wiki/List_of_longest_English_words#Chemically_relevant_words_and_phrases\n" +
"https://creativecommons.org/licenses/by-nc-sa/4.0/legalcode\n" +
"https://developers.google.com/maps/documentation/javascript/places-autocomplete?hl=en\n" +
"https://www.federalregister.gov/documents/2023/03/17/2023-05333/medicare-and-medicaid-programs-hospital-inpatient-prospective-payment-systems-for-acute-care\n" +
"https://www.irs.gov/pub/irs-prior/i1040gi--2022.pdf\n" +
"https://www.nature.com/articles/s41586-023-05772-w\n" +
"https://www.bbc.com/news/world-europe-64977777\n" +
"https://www.nationalgeographic.org/encyclopedia/photosynthesis/\n" +
"https://www.un.org/sustainabledevelopment/climate-change/\n" +
"https://www.who.int/news-room/fact-sheets/detail/coronavirus-disease-(covid-19)\n" +
"https://www.loc.gov/item/2021668778/\n" +
"https://www.nasa.gov/mission_pages/webb/about/index.html\n" +
"https://physics.stackexchange.com/questions/123456/a-very-long-and-detailed-question-about-a-specific-physics-concept-with-lots-of-equations\n" +
"https://math.stackexchange.com/questions/789012/another-extremely-long-mathematical-query-involving-complex-notations-and-theorems\n" +
"https://softwareengineering.stackexchange.com/questions/345678/a-lengthy-discussion-about-software-architecture-patterns-and-best-practices-with-code-examples\n" +
"https://security.stackexchange.com/questions/90123/a-comprehensive-inquiry-regarding-network-security-vulnerabilities-and-mitigation-strategies\n" +
"https://history.stackexchange.com/questions/56789/a-detailed-historical-question-requiring-multiple-sources-and-perspectives-on-a-specific-event\n" +
"https://cooking.stackexchange.com/questions/12345/a-very-elaborate-recipe-with-many-ingredients-and-detailed-instructions-for-a-complex-dish\n" +
"https://travel.stackexchange.com/questions/67890/a-comprehensive-itinerary-request-for-a-multi-country-trip-with-specific-activities-and-budget-constraints\n" +
"https://biology.stackexchange.com/questions/23456/a-thorough-biological-question-involving-complex-cellular-processes-and-genetic-interactions\n" +
"https://linguistics.stackexchange.com/questions/89012/an-in-depth-linguistic-analysis-of-a-specific-grammatical-structure-across-different-languages\n" +
"https://philosophy.stackexchange.com/questions/45678/a-complex-philosophical-debate-concerning-ethics-metaphysics-and-epistemology-with-various-arguments\n" +
"https://astronomy.stackexchange.com/questions/10123/a-detailed-astronomical-inquiry-about-distant-galaxies-black-holes-and-cosmological-theories\n" +
"https://economics.stackexchange.com/questions/5678/a-comprehensive-economic-analysis-of-a-specific-market-trend-with-statistical-data-and-policy-implications\n" +
"https://psychology.stackexchange.com/questions/901/an-in-depth-psychological-question-exploring-cognitive-biases-behavioral-patterns-and-therapeutic-interventions\n" +
"https://politics.stackexchange.com/questions/234/a-detailed-political-science-question-regarding-different-governance-systems-ideologies-and-international-relations\n" +
"https://academia.stackexchange.com/questions/56/a-comprehensive-academic-inquiry-about-research-methodologies-publication-processes-and-grant-writing-strategies\n" +
"https://outdoors.stackexchange.com/questions/78/a-detailed-question-about-backpacking-gear-survival-techniques-and-wilderness-navigation-in-extreme-conditions\n" +
"https://diy.stackexchange.com/questions/90/a-comprehensive-do-it-yourself-project-involving-complex-construction-electrical-or-plumbing-work-with-detailed-instructions\n" +
"https://parenting.stackexchange.com/questions/12/a-detailed-parenting-question-addressing-child-development-behavioral-issues-and-educational-approaches-for-different-age-groups\n" +
"https://pets.stackexchange.com/questions/34/a-comprehensive-pet-care-question-involving-specific-breeds-health-concerns-training-techniques-and-nutritional-requirements\n" +
"https://gardening.stackexchange.com/questions/56/a-detailed-gardening-question-about-specific-plant-species-soil-conditions-pest-control-and-seasonal-maintenance\n" +
"https://boardgames.stackexchange.com/questions/78/a-comprehensive-question-about-strategy-rules-and-variants-for-a-complex-board-game-with-many-components\n" +
"https://movies.stackexchange.com/questions/90/a-detailed-question-about-the-plot-characters-themes-and-production-history-of-a-specific-film-with-spoilers\n" +
"https://music.stackexchange.com/questions/12/a-comprehensive-musical-theory-question-involving-harmony-melody-rhythm-and-form-with-musical-examples\n" +
"https://anime.stackexchange.com/questions/34/a-detailed-question-about-the-storyline-characters-animation-style-and-cultural-references-in-a-specific-anime-series\n" +
"https://scifi.stackexchange.com/questions/56/a-comprehensive-science-fiction-question-exploring-futuristic-technologies-alien-civilizations-and-philosophical-implications-in-a-specific-work\n" +
"https://fantasy.stackexchange.com/questions/78/a-detailed-fantasy-literature-question-regarding-world-building-magic-systems-character-arcs-and-lore-in-a-specific-series\n" +
"https://crypto.stackexchange.com/questions/901234/a-very-long-and-detailed-question-about-cryptographic-algorithms-blockchain-technology-and-security-protocols\n" +
"https://ethereum.stackexchange.com/questions/567890/another-extremely-long-ethereum-related-query-involving-smart-contracts-dapps-and-gas-optimization-techniques\n" +
"https://bitcoin.stackexchange.com/questions/1234567/a-lengthy-discussion-about-bitcoin-mining-transactions-scalability-solutions-and-the-lightning-network\n" +
"https://ai.stackexchange.com/questions/890123/a-comprehensive-inquiry-regarding-machine-learning-algorithms-neural-networks-natural-language-processing-and-computer-vision\n" +
"https://datascience.stackexchange.com/questions/456789/a-detailed-data-science-question-involving-statistical-modeling-data-visualization-feature-engineering-and-model-evaluation\n" +
"https://robotics.stackexchange.com/questions/234567/a-very-elaborate-robotics-question-with-many-sub-questions-about-kinematics-control-sensors-and-path-planning\n" +
"https://gamedev.stackexchange.com/questions/90123/a-comprehensive-game-development-question-covering-game-design-programming-graphics-audio-and-level-design-aspects\n" +
"https://ux.stackexchange.com/questions/5678/a-detailed-user-experience-design-question-involving-usability-testing-information-architecture-interaction-design-and-visual-design\n" +
"https://android.stackexchange.com/questions/9012/a-comprehensive-android-development-question-covering-ui-design-background-tasks-data-storage-and-network-communication\n" +
"https://ios.stackexchange.com/questions/3456/a-detailed-ios-development-question-involving-swift-objective-c-storyboards-auto-layout-and-app-store-submission\n" +
"https://stackoverflow.com/questions/12345678/a-very-long-and-detailed-programming-question-with-multiple-code-snippets-and-error-messages\n" +
"https://stackoverflow.com/questions/98765432/another-extremely-long-programming-query-involving-a-specific-framework-library-and-complex-logic\n" +
"https://serverfault.com/questions/123456/a-lengthy-system-administration-question-about-server-configuration-networking-security-and-performance-tuning\n" +
"https://superuser.com/questions/789012/a-comprehensive-superuser-question-regarding-operating-systems-software-applications-hardware-peripherals-and-troubleshooting\n" +
"https://askubuntu.com/questions/345678/a-detailed-ubuntu-specific-question-involving-package-management-desktop-environment-command-line-utilities-and-system-customization\n" +
"https://apple.stackexchange.com/questions/567890/a-comprehensive-apple-hardware-and-software-question-covering-macos-ios-ipados-and-related-devices\n" +
"https://wordpress.stackexchange.com/questions/123456/a-very-elaborate-wordpress-development-and-administration-question-with-code-examples-and-plugin-configurations\n" +
"https://drupal.stackexchange.com/questions/78901/a-comprehensive-drupal-development-and-site-building-question-involving-modules-themes-twig-and-configuration\n" +
"https://joomla.stackexchange.com/questions/23456/a-detailed-joomla-development-and-administration-question-covering-components-modules-plugins-and-templates\n" +
"https://magento.stackexchange.com/questions/8901/a-comprehensive-magento-development-and-ecommerce-question-involving-customization-extensions-themes-and-store-setup\n" +
"https://shopify.stackexchange.com/questions/4567/a-detailed-shopify-development-and-store-management-question-covering-liquid-apps-themes-and-api-integrations\n" +
"https://laravel.io/forum/a-very-long-forum-topic-with-many-replies-and-code-examples-related-to-a-specific-laravel-feature\n" +
"https://forum.vuejs.org/t/an-extremely-long-discussion-thread-about-a-complex-vue-js-component-with-multiple-solutions-and-approaches\n" +
"https://reactjs.org/docs/context.html#when-to-use-context\n" +
"https://angular.io/guide/dependency-injection#why-dependency-injection\n" +
"https://svelte.dev/tutorial/reactive-declarations\n" +
"https://expressjs.com/en/guide/routing.html\n" +
"https://djangoproject.com/docs/4.2/topics/http/urls/\n" +
"https://flask.palletsprojects.com/en/2.3.x/api/#flask.Flask.route\n" +
"https://rubyonrails.org/routing.html\n" +
"https://spring.io/guides/gs/rest-service/\n" +
"https://dotnet.microsoft.com/en-us/learn/aspnet/mvc-tutorial/overview\n" +
"https://cloud.google.com/storage/docs/naming-buckets\n" +
"https://aws.amazon.com/s3/pricing/\n" +
"https://azure.microsoft.com/en-us/pricing/details/storage/blobs/\n" +
"https://kubernetes.io/docs/concepts/overview/components/\n" +
"https://www.docker.com/why-docker/\n" + "https://www.booking.com/hotel/us/the-grand-inn.en-gb.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaLsBiAEBmAEJuAEHyAEM2AEB6AEB-AECiAIBqAIDuAKBnZquBsACAdICJDIyMzFlOGYwLWRiMTYtNGMyYS04ZDRjLTZlOGZhNzAyNjg2NtgCBeACAQ&sid=abc123456789\n"+
"https://www.zillow.com/homedetails/12345-Fake-St-Springfield-IL-62704/12345678_zpid/?utm_source=hash_test&utm_medium=dev\n"+
"https://ieeexplore.ieee.org/document/1234567?arnumber=1234567&source=authors&tag=paper&utm_term=hash\n"+
"https://accounts.spotify.com/en/login?continue=https%3A%2F%2Fopen.spotify.com%2Fplaylist%2F37i9dQZF1DWXRqgorJj26U%3Fsi%3Dabc123xyz\n"+
"https://www.washingtonpost.com/climate-environment/interactive/2025/climate-change-data-tracker/?utm_campaign=enviro&utm_source=newsletter\n"+
"https://support.apple.com/en-us/HT201222?productName=iPhone&version=16.4.1&locale=en_US&hashref=devtest\n"+
"https://edition.cnn.com/travel/article/most-beautiful-places-visit-2025/index.html?utm_content=travel_guides&utm_source=referral\n"+
"https://www.scientificamerican.com/article/the-mathematics-of-url-shortening-services/?ref=hash_benchmarking&utm_term=tech\n"+
"https://www.oracle.com/cloud/cloud-infrastructure/what-is-oci.html?source=nav&utm_campaign=hash_eval&medium=test\n"+
"https://cloudflare.com/learning/dns/what-is-dns/?utm_source=docs&utm_medium=referral&utm_term=dns-url-collision\n"+
"https://www.adobe.com/creativecloud/design/discover/portfolio-examples.html?trackingid=ABC123XYZ&mv=hashcheck\n"+
"https://aws.amazon.com/blogs/aws/new-amazon-url-shortener-service-with-dedicated-endpoints/?utm_campaign=launch&utm_term=hash_testing\n"+
"https://www.gnu.org/software/bash/manual/bash.html#Shell-Parameter-Expansion?utm_source=devdocs&utm_medium=hashing\n"+
"https://www.linkedin.com/pulse/testing-url-hash-collisions-large-scale-inputs-john-doe/?trackingId=abc123xyz\n"+
"https://web.archive.org/web/20240430123456/https://example.com/very/long/path/to/resource?with=params&lots=of&info=hashworthy\n"+
"https://www.w3schools.com/jsref/prop_url_href.asp?ref=hashURLCheck&utm_tag=js-test-case\n"+
"https://arstechnica.com/gadgets/2025/04/testing-url-shortener-collisions-with-massive-inputs/?comments=1&topic=hashing\n"+
"https://www.npr.org/2025/04/30/123456789/what-makes-a-good-url-shortener?utm_source=hash_tests&utm_campaign=code\n"+
"https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/get?test=hashCollision&id=test-case\n"+
"https://code.visualstudio.com/updates/v1_80?whatsnew=hash-function-debugger\n"+
"https://tools.ietf.org/html/rfc3986#section-2.2?test=true&debug=hashURL\n"+
"https://archive.org/details/test-url-hashing-case-study-2025?q=hash&view=full&debug=true\n"+
"https://news.google.com/articles/CAIiEGhJKsdf98q_LRQ?utm_campaign=hash_benchmark&utm_term=urls\n"+
"https://www.npmjs.com/package/ultra-long-url-simulator?test_case=hash&version=3.2.1\n"+
"https://github.com/openai/url-hashing-test-suite/issues/42?utm_source=codebase&utm_medium=issue_tracking\n"+
"https://www.researchgate.net/publication/123456789_URL_Shortener_Hashing_Analysis_A_Case_Study?channel=research\n"+
"https://www.heroku.com/deploy?template=https%3A%2F%2Fgithub.com%2Fyouraccount%2Fhash-function-test-app\n"+
"https://www.udacity.com/course/data-structures-and-algorithms-nanodegree--nd256?tracking_id=hash_case&batch=april25\n"+
"https://www.geeksforgeeks.org/url-shortening-service-using-hashmaps-in-java/?ref=hash_dive&test_case=true\n"+
"https://medium.com/@developer/test-your-url-hash-functions-with-these-50-collision-candidates-1a2b3c4d\n"+
"https://medium.com/swlh/avoiding-hash-collisions-in-url-shorteners-f302be3f9e4a?source=hash-check\n" +     "https://www.google.com/search?q=java+url+shortener+test&oq=java+url+shortener+test&aqs=chrome..69i57j0i512l9.12345j0j7&sourceid=chrome&ie=UTF-8\n" +
    "https://maps.google.com/maps?q=1600+Amphitheatre+Parkway,+Mountain+View,+CA&hl=en&t=m&z=15&output=embed\n" +
    "https://drive.google.com/drive/folders/1ABCdefGHIjklMNopQRStuVWXyz?usp=sharing\n" +
    "https://docs.google.com/document/d/1qaz2wsx3edc4rfv5tgb6yhnujm/edit?usp=sharing&rtpof=true\n" +
    "https://mail.google.com/mail/u/0/#inbox/FMfcgzGxTNqjQZXQZXQZXQZXQZXQZXQZXQ\n" +
    "https://calendar.google.com/calendar/r?tab=rc&pli=1\n" +
    "https://play.google.com/store/apps/details?id=com.example.app&hl=en_US&gl=US\n" +
    "https://news.google.com/articles/CAIiEJ5KQ5q3m4zX7X8Y9X1Y2X3Y4?hl=en-US&gl=US&ceid=US:en\n" +
    "https://cloud.google.com/run/docs/quickstarts/build-and-deploy/deploy-java-service\n" +
    "https://developers.google.com/maps/documentation/urls/get-started#universal-cross-platform-syntax\n" +
    "https://www.youtube.com/watch?v=dQw4w9WgXcQ&list=PLABCDEFGHIJKLMNOPQRSTUVWXYZ&index=1&t=10s\n" +
    "https://youtu.be/dQw4w9WgXcQ?t=42\n" +
    "https://studio.youtube.com/channel/UCABCDEFGHIJKLMNOPQRSTUV/videos/editing\n" +
    "https://music.youtube.com/watch?v=dQw4w9WgXcQ&list=RDAMVMdQw4w9WgXcQ\n" +
    "https://www.youtube.com/playlist?list=PLABCDEFGHIJKLMNOPQRSTUVWXYZ\n" +
    "https://www.youtube.com/c/ChannelName/videos?view=2&sort=dd&shelf_id=3\n" +
    "https://www.youtube.com/live/ABCDEFGHIJK?feature=share&t=1h2m3s\n" +
    "https://www.youtube.com/embed/dQw4w9WgXcQ?autoplay=1&mute=1\n" +
    "https://www.youtube.com/results?search_query=java+url+shortener+test\n" +
    "https://www.youtube.com/hashtag/test\n" +
    "https://github.com/username/repo-name/blob/main/src/com/example/Test.java#L42-L56\n" +
    "https://github.com/username/repo-name/compare/main...feature-branch?expand=1\n" +
    "https://github.com/username/repo-name/issues/123#issuecomment-1234567890\n" +
    "https://github.com/username/repo-name/pull/456/files?file-filters%5B%5D=.java\n" +
    "https://github.com/username/repo-name/actions/runs/1234567890\n" +
    "https://github.com/username/repo-name/projects/1?card_filter_query=label%3Abug\n" +
    "https://github.com/username/repo-name/wiki/Getting-Started/_compare/abc123...def456\n" +
    "https://github.com/username/repo-name/releases/tag/v1.2.3\n" +
    "https://github.com/username/repo-name/archive/refs/heads/main.zip\n" +
    "https://github.com/features/actions\n" +
    "https://www.amazon.com/Product-Name/dp/B08N5KWB9H/ref=sr_1_1?keywords=test+product&qid=1234567890&sr=8-1&th=1\n" +
    "https://www.amazon.com/gp/product/B08N5KWB9H/ref=ppx_yo_dt_b_asin_title_o00_s00?ie=UTF8&psc=1\n" +
    "https://www.amazon.com/Amazon-Video/b?ie=UTF8&node=2858778011\n" +
    "https://www.amazon.com/gp/aws/cart/add.html?AssociateTag=test-20&ASIN.1=B08N5KWB9H&Quantity.1=1\n" +
    "https://www.amazon.com/gp/help/customer/display.html?nodeId=202045160\n" +
    "https://www.amazon.com/hz/wishlist/ls/ABCDEFGHIJKLM?filter=unpurchased&sort=default\n" +
    "https://www.amazon.com/gp/registry/wishlist/ref=cm_wl_huc_view\n" +
    "https://www.amazon.com/gp/css/order-history?ref_=nav_orders_first\n" +
    "https://www.amazon.com/gp/bestsellers/?ref_=nav_cs_bestsellers\n" +
    "https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb\n" +
    "https://stackoverflow.com/questions/12345678/how-to-test-a-url-shortener-in-java\n" +
    "https://stackoverflow.com/a/12345678/1234567\n" +
    "https://stackoverflow.com/questions/tagged/java+url-shortener?sort=votes&pageSize=15\n" +
    "https://stackoverflow.com/users/1234567/username?tab=profile\n" +
    "https://stackoverflow.com/jobs/companies?q=java+developer&l=remote\n" +
    "https://stackoverflow.com/help/badges/123/url-shortener\n" +
    "https://stackoverflow.com/search?q=java+url+shortener+test\n" +
    "https://stackoverflow.com/questions/12345678/long-url-testing-for-url-shorteners?noredirect=1&lq=1\n" +
    "https://stackoverflow.com/collectives?tab=featured\n" +
    "https://stackoverflow.com/teams/for/teams\n" +

    // Extended Wikipedia URLs (10 variants)
    "https://en.wikipedia.org/wiki/URL_shortening#Security_issues_and_limitations\n" +
    "https://en.wikipedia.org/w/index.php?title=URL_shortening&oldid=1234567890\n" +
    "https://en.wikipedia.org/wiki/Special:Random\n" +
    "https://en.wikipedia.org/wiki/Wikipedia:Manual_of_Style/Linking#When_not_to_link\n" +
    "https://en.wikipedia.org/wiki/Java_(programming_language)#History\n" +
    "https://en.wikipedia.org/w/index.php?search=java+url+shortener&title=Special:Search&profile=advanced&fulltext=1&ns0=1\n" +
    "https://en.wikipedia.org/wiki/User:Example_user/sandbox\n" +
    "https://en.wikipedia.org/wiki/Template:URL\n" +
    "https://en.wikipedia.org/wiki/Help:Link#External_links\n" +
    "https://en.wikipedia.org/wiki/Portal:Current_events/2024_January_1\n" +

    // Extended Government URLs (10 variants)
    "https://www.usa.gov/federal-agencies/national-aeronautics-and-space-administration\n" +
    "https://www.whitehouse.gov/administration/president-biden/\n" +
    "https://www.congress.gov/bill/117th-congress/house-bill/1234/text?r=1&s=1\n" +
    "https://www.irs.gov/individuals/get-transcript\n" +
    "https://www.ssa.gov/myaccount/?gclid=1234567890\n" +
    "https://www.fda.gov/emergency-preparedness-and-response/coronavirus-disease-2019-covid-19\n" +
    "https://www.cdc.gov/coronavirus/2019-ncov/index.html\n" +
    "https://www.epa.gov/environmental-topics/air-topics\n" +
    "https://www.doi.gov/blog/10-tips-enjoying-national-parks\n" +
    "https://www.defense.gov/News/News-Stories/Article/Article/1234567/\n" +

    // Extended University URLs (10 variants)
    "https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-006-introduction-to-algorithms-fall-2011/\n" +
    "https://online.stanford.edu/courses/soe-ycsautomata-automata-theory\n" +
    "https://www.harvard.edu/about-harvard/harvard-glance\n" +
    "https://www.cam.ac.uk/research/news/new-approach-could-reshape-robot-navigation\n" +
    "https://www.ox.ac.uk/admissions/graduate/courses/msc-computer-science\n" +
    "https://www.berkeley.edu/academics/research\n" +
    "https://www.ethz.ch/en/studies/degree-programmes/master/computer-science.html\n" +
    "https://www.tum.de/en/studies/degree-programs/detail/computer-science-master-of-science-msc\n" +
    "https://www.nus.edu.sg/registrar/academic-information-policies/graduate/graduate-programmes-by-coursework\n" +
    "https://www.utoronto.ca/academics-programs\n" +

    // Extended News URLs (10 variants)
    "https://www.nytimes.com/2024/01/01/technology/ai-chatbots-url-shorteners.html?smid=url-share\n" +
    "https://www.washingtonpost.com/technology/2024/01/01/url-shorteners-privacy-risks/?utm_campaign=wp_main&utm_medium=social&utm_source=twitter\n" +
    "https://www.theguardian.com/technology/2024/jan/01/url-shorteners-security-risks\n" +
    "https://www.bbc.com/news/technology-12345678\n" +
    "https://www.reuters.com/technology/short-urls-long-risks-2024-01-01/\n" +
    "https://www.bloomberg.com/news/articles/2024-01-01/url-shorteners-are-a-security-nightmare\n" +
    "https://www.cnn.com/2024/01/01/tech/url-shorteners-privacy/index.html\n" +
    "https://www.npr.org/sections/technology/2024/01/01/1234567890/url-shorteners-privacy-concerns\n" +
    "https://www.aljazeera.com/news/2024/1/1/url-shorteners-security-risks\n" +
    "https://www.wired.com/story/url-shorteners-privacy-risks/\n" +

    // Extended API Documentation URLs (10 variants)
    "https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/net/URL.html\n" +
    "https://developer.mozilla.org/en-US/docs/Web/API/URL/URL\n" +
    "https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/util/UriComponentsBuilder.html\n" +
    "https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html\n" +
    "https://cloud.google.com/storage/docs/json_api/v1/objects/get\n" +
    "https://docs.microsoft.com/en-us/dotnet/api/system.uri?view=net-6.0\n" +
    "https://stripe.com/docs/api/authentication\n" +
    "https://stripe.com/docs/api/authentication\n" +
    "https://developer.twitter.com/en/docs/twitter-api\n" +
    "https://developers.facebook.com/docs/graph-api/\n" +

    // Extended E-commerce URLs (10 variants)
    "https://www.etsy.com/listing/1234567890/handmade-test-product?ga_order=most_relevant&ga_search_type=all&ga_view_type=gallery&ga_search_query=test&ref=sr_gallery-1-1\n" +
    "https://www.aliexpress.com/item/1234567890.html?spm=a2g0o.productlist.0.0.1234567890&algo_pvid=12345678-1234-1234-1234-123456789012\n" +
    "https://www.ebay.com/itm/1234567890?hash=itemabc123def:g:XYZAAOSwXYZ123&LH_BIN=1\n" +
    "https://www.walmart.com/ip/Test-Product/1234567890?selected=true\n" +
    "https://www.target.com/p/test-product/-/A-12345678?preselect=12345678\n" +
    "https://www.bestbuy.com/site/test-product/12345678.p?skuId=12345678\n" +
    "https://www.newegg.com/test-product/p/123-456-789?Item=123-456-789\n" +
    "https://www.zappos.com/p/test-product-12345678/color/123\n" +
    "https://www.wayfair.com/keyword.php?keyword=test+product\n" +
    "https://www.overstock.com/Home-Garden/Test-Product/12345678/product.html\n" +

    // Extended Cloud Service URLs (10 variants)
    "https://console.cloud.google.com/storage/browser/test-bucket?project=test-project-123456\n" +
    "https://aws.amazon.com/console/home?region=us-east-1#\n" +
    "https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview\n" +
    "https://cloud.digitalocean.com/projects/12345678-1234-1234-1234-123456789012\n" +
    "https://app.heroku.com/apps/test-app-12345678/resources\n" +
    "https://cloud.oracle.com/compute/instances?region=us-phoenix-1\n" +
    "https://cloud.ibm.com/resources?query=test\n" +
    "https://account.cloudflare.com/overview\n" +
    "https://cloud.linode.com/linodes\n" +
    "https://us1.cloud.realm.io/\n" +

    // Extended Documentation URLs (10 variants)
    "https://dev.mysql.com/doc/refman/8.0/en/string-functions.html#function_concat\n" +
    "https://redis.io/commands/set\n" +
    "https://www.postgresql.org/docs/current/functions-string.html\n" +
    "https://docs.mongodb.com/manual/reference/operator/aggregation/concat/\n" +
    "https://httpd.apache.org/docs/2.4/rewrite/intro.html\n" +
    "https://nginx.org/en/docs/http/ngx_http_rewrite_module.html\n" +
    "https://docs.docker.com/engine/reference/commandline/build/\n" +
    "https://kubernetes.io/docs/reference/kubectl/cheatsheet/\n" +
    "https://jestjs.io/docs/getting-started\n" +
    "https://docs.gradle.org/current/userguide/userguide.html\n" +

    // Extended Social Media URLs (10 variants)
    "https://www.linkedin.com/jobs/view/1234567890/?alternateChannel=search&refId=abc123&trk=d_flagship3_search_srp_jobs\n" +
    "https://www.reddit.com/r/technology/comments/abc123/this_is_a_test_post/?utm_source=share&utm_medium=web2x&context=3\n" +
    "https://www.pinterest.com/pin/123456789012345678/feed/?test=1\n" +
    "https://www.tumblr.com/test-blog/1234567890/test-post?source=share\n" +
    "https://www.flickr.com/photos/testuser/12345678901/in/album-1234567890/\n" +
    "https://imgur.com/gallery/ABC123DEF?utm_source=test\n" +
    "https://www.deviantart.com/testuser/art/Test-Art-1234567890\n" +
    "https://www.twitch.tv/teststreamer/clip/ABC123?filter=clips&range=7d\n" +
    "https://discord.com/channels/1234567890/987654321/123456789012345678\n" +
    "https://soundcloud.com/test-user/test-song-2024?si=abc123\n" +

    // Extended Academic URLs (10 variants)
    "https://arxiv.org/abs/1234.5678\n" +
    "https://www.researchgate.net/publication/123456789_Test_Paper\n" +
    "https://scholar.google.com/citations?user=ABCDEFG&hl=en\n" +
    "https://www.jstor.org/stable/12345678?seq=1\n" +
    "https://dl.acm.org/doi/10.1145/1234567.1234568\n" +
    "https://ieeexplore.ieee.org/document/12345678\n" +
    "https://www.sciencedirect.com/science/article/pii/S1234567890123456\n" +
    "https://link.springer.com/article/10.1007/s12345-012-3456-9\n" +
    "https://www.nature.com/articles/s41586-024-12345-6\n" +
    "https://www.science.org/doi/10.1126/science.1234567\n" +
    "https://example.com/path/to/resource?param1=value1&param2=value2&param3=value3\n" +
    "https://subdomain.example.com/another/path?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
    "https://www.test.com/this/is/a/very/long/path/with/many/subdirectories/and/a/long/filename.html?query=string&with=multiple&params=and&special=chars%20%21%40%23%24%25%5E%26%2A%28%29\n" +
    "https://api.example.com/v3/users/12345/posts/67890/comments/1234567890/replies/0987654321/likes/54321?filter=recent&limit=100&offset=0&sort=desc&include=user,post,comment,reply\n" +
    "https://test.example.org/path/to/resource?id=1234567890abcdef1234567890abcdef&token=abcdef1234567890abcdef1234567890&expires=1234567890&signature=abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890\n" +
    "https://www.longurls.com/this/is/a/very/long/url/with/many/segments/and/parameters?param1=value1&param2=value2&param3=value3&param4=value4&param5=value5\n" +
    "https://www.anotherlongurl.org/path1/path2/path3/path4/path5/path6/path7/path8/path9/path10?query1=value1&query2=value2&query3=value3&query4=value4&query5=value5\n" +
    "https://www.urltesting.com/segment1/segment2/segment3/segment4/segment5/segment6/segment7/segment8/segment9/segment10?param1=value1&param2=value2&param3=value3&param4=value4&param5=value5\n" +
    "https://www.testinglongurls.net/path/to/resource/with/many/segments/and/parameters?key1=value1&key2=value2&key3=value3&key4=value4&key5=value5\n" +
    "https://www.extremelylongurls.com/this/is/an/example/of/a/very/very/very/long/url/with/many/many/many/segments/and/parameters?param1=value1&param2=value2&param3=value3&param4=value4&param5=value5\n";
        String[] arr = urls.split("\\n");
        try {
            HashMap map = new HashMap();
            int total = arr.length;
            int inserted = 0;

            for (String url : arr) {
                System.out.print(url + ": ");
                try {
                    map.add(url);
                    inserted++;
                    long idx = new Link(url).toHashCode() % HashMap.SIZE;
                    System.out.printf("Inserted: index %d%n", idx);
                } catch (Exception e) {
                    System.out.printf("\u001B[31m Failed. Error code: %s%n\u001B[0m", e.getMessage());
                }
            }

            System.out.printf("%nTotal URLs: %d, successfully inserted: %d%n", total, inserted);
            System.out.println("Listas de colisiones:");
            for (int i = 0; i < 65536; i++) {
                Lista<Link> bucket = map.getCol(i);
                if (!bucket.isEmpty()) {
                    System.out.printf("Lista %d (%d elementos):%n", i, bucket.size());
                }
            }
            System.out.println(map.shorten("http://www.google.com/"));
            System.out.println(map.getLink("65C90").getLink());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

