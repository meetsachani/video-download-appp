package o;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: o.gM  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6533gM {
    public final Map<String, Object> a = new HashMap();
    public final List<String> b = new ArrayList();

    public static C6533gM h(C6533gM c6533gM, long j) {
        return c6533gM.e(InterfaceC6278fM.c, j);
    }

    public static C6533gM i(C6533gM c6533gM, @InterfaceC11300zs1 Uri uri) {
        if (uri == null) {
            return c6533gM.d(InterfaceC6278fM.b);
        }
        return c6533gM.f(InterfaceC6278fM.b, uri.toString());
    }

    @InterfaceC6181ey
    public final C6533gM a(String str, Object obj) {
        this.a.put((String) C9542sf.g(str), C9542sf.g(obj));
        this.b.remove(str);
        return this;
    }

    public Map<String, Object> b() {
        HashMap hashMap = new HashMap(this.a);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public List<String> c() {
        return Collections.unmodifiableList(new ArrayList(this.b));
    }

    @InterfaceC6181ey
    public C6533gM d(String str) {
        this.b.add(str);
        this.a.remove(str);
        return this;
    }

    @InterfaceC6181ey
    public C6533gM e(String str, long j) {
        return a(str, Long.valueOf(j));
    }

    @InterfaceC6181ey
    public C6533gM f(String str, String str2) {
        return a(str, str2);
    }

    @InterfaceC6181ey
    public C6533gM g(String str, byte[] bArr) {
        return a(str, Arrays.copyOf(bArr, bArr.length));
    }
}
