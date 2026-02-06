package o;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;

/* renamed from: o.Bu1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C2597Bu1 {
    public static /* synthetic */ void a(Object obj) {
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
        } else if (obj instanceof ExecutorService) {
            C2695Cu1.a((ExecutorService) obj);
        } else if (obj instanceof TypedArray) {
            ((TypedArray) obj).recycle();
        } else if (obj instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) obj).release();
        } else if (obj instanceof MediaDrm) {
            ((MediaDrm) obj).release();
        } else {
            C2793Du1.a(obj);
        }
    }
}
