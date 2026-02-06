package o;

import android.net.Uri;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: o.Yj0 */
/* loaded from: classes2.dex */
public interface InterfaceC4809Yj0 {
    public static final InterfaceC4809Yj0 a = new InterfaceC4809Yj0() { // from class: o.Xj0
        @Override // o.InterfaceC4809Yj0
        public final InterfaceC4324Tj0[] b() {
            return InterfaceC4809Yj0.c();
        }
    };

    static /* synthetic */ InterfaceC4324Tj0[] c() {
        return new InterfaceC4324Tj0[0];
    }

    default InterfaceC4324Tj0[] a(Uri uri, Map<String, List<String>> map) {
        return b();
    }

    InterfaceC4324Tj0[] b();
}
