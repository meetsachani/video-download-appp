package o;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class XM0 {
    public final List<ImageHeaderParser> a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.a.add(imageHeaderParser);
    }

    public synchronized List<ImageHeaderParser> b() {
        return this.a;
    }
}
