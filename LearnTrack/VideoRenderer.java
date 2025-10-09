package LearnTrack;

public class VideoRenderer implements CourseContentRenderer {
    @Override
    public void renderContent(String content) {
        System.out.println("Rendering video content: " + content);
    }
}