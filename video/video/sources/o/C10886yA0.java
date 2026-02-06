package o;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

@Deprecated
/* renamed from: o.yA0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10886yA0 {
    public final LinkedHashMap<Uri, byte[]> a;

    /* renamed from: o.yA0$a */
    /* loaded from: classes2.dex */
    public class a extends LinkedHashMap<Uri, byte[]> {
        public final /* synthetic */ int X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, float f, boolean z, int i2) {
            super(i, f, z);
            this.X = i2;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            if (size() > this.X) {
                return true;
            }
            return false;
        }
    }

    public C10886yA0(int i) {
        this.a = new a(i + 1, 1.0f, false, i);
    }

    public boolean a(Uri uri) {
        return this.a.containsKey(C9542sf.g(uri));
    }

    @InterfaceC11300zs1
    public byte[] b(@InterfaceC11300zs1 Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.a.get(uri);
    }

    @InterfaceC11300zs1
    public byte[] c(Uri uri, byte[] bArr) {
        return this.a.put((Uri) C9542sf.g(uri), (byte[]) C9542sf.g(bArr));
    }

    @InterfaceC11300zs1
    public byte[] d(Uri uri) {
        return this.a.remove(C9542sf.g(uri));
    }
}
