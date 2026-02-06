package o;

import android.media.MediaMuxer;
import java.io.FileDescriptor;
import java.io.IOException;

/* renamed from: o.za  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11226za {
    public static MediaMuxer a(FileDescriptor fileDescriptor, int i) throws IOException {
        return new MediaMuxer(fileDescriptor, i);
    }
}
