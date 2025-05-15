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
        "http://223.255.255.254";
        String[] arr = urls.split("\\n");
        try {
            HashMap map = new HashMap();
            int total = arr.length;
            int inserted = 0;

            for (String url : arr) {
                System.out.print(url + ": ");
                try {
                    map.put(url);
                    inserted++;
                    long idx = new Link(url).hashCode();
                    System.out.printf("Inserted: index %d%n", idx);
                } catch (Exception e) {
                    System.out.printf("Failed. Error code: %s%n", e.getMessage());
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

