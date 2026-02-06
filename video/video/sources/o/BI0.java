package o;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o.FU;
import o.InterfaceC10186vI0;
import o.InterfaceC3628Mg0;
import o.OU;
import org.jsoup.helper.HttpConnection;

@Deprecated
/* loaded from: classes2.dex */
public final class BI0 implements InterfaceC7090if1 {
    public static final int e = 5;
    public final FU.a a;
    @InterfaceC11300zs1
    public final String b;
    public final boolean c;
    public final Map<String, String> d;

    public BI0(@InterfaceC11300zs1 String str, FU.a aVar) {
        this(str, false, aVar);
    }

    public static byte[] e(FU.a aVar, String str, @InterfaceC11300zs1 byte[] bArr, Map<String, String> map) throws C7332jf1 {
        C4004Qc2 c4004Qc2 = new C4004Qc2(aVar.a());
        OU a = new OU.b().k(str).f(map).e(2).d(bArr).c(1).a();
        int i = 0;
        OU ou = a;
        while (true) {
            try {
                MU mu = new MU(c4004Qc2, ou);
                try {
                    byte[] S1 = TD2.S1(mu);
                    TD2.t(mu);
                    return S1;
                } catch (InterfaceC10186vI0.f e2) {
                    String f = f(e2, i);
                    if (f != null) {
                        i++;
                        ou = ou.a().k(f).a();
                        TD2.t(mu);
                    } else {
                        throw e2;
                    }
                }
            } catch (Exception e3) {
                throw new C7332jf1(a, (Uri) C9542sf.g(c4004Qc2.y()), c4004Qc2.b(), c4004Qc2.m(), e3);
            }
        }
    }

    @InterfaceC11300zs1
    public static String f(InterfaceC10186vI0.f fVar, int i) {
        Map<String, List<String>> map;
        List<String> list;
        int i2 = fVar.c1;
        if ((i2 != 307 && i2 != 308) || i >= 5 || (map = fVar.e1) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // o.InterfaceC7090if1
    public byte[] a(UUID uuid, InterfaceC3628Mg0.b bVar) throws C7332jf1 {
        String str;
        String b = bVar.b();
        if (this.c || TextUtils.isEmpty(b)) {
            b = this.b;
        }
        if (!TextUtils.isEmpty(b)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = C10323vs.h2;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (C10323vs.f2.equals(uuid)) {
                str = "application/json";
            } else {
                str = HttpConnection.l;
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.d) {
                hashMap.putAll(this.d);
            }
            return e(this.a, b, bVar.a(), hashMap);
        }
        OU.b bVar2 = new OU.b();
        Uri uri = Uri.EMPTY;
        throw new C7332jf1(bVar2.j(uri).a(), uri, AbstractC6044eO0.u(), 0L, new IllegalStateException("No license URL"));
    }

    @Override // o.InterfaceC7090if1
    public byte[] b(UUID uuid, InterfaceC3628Mg0.h hVar) throws C7332jf1 {
        return e(this.a, hVar.b() + "&signedRequest=" + TD2.N(hVar.a()), null, Collections.EMPTY_MAP);
    }

    public void c() {
        synchronized (this.d) {
            this.d.clear();
        }
    }

    public void d(String str) {
        C9542sf.g(str);
        synchronized (this.d) {
            this.d.remove(str);
        }
    }

    public void g(String str, String str2) {
        C9542sf.g(str);
        C9542sf.g(str2);
        synchronized (this.d) {
            this.d.put(str, str2);
        }
    }

    public BI0(@InterfaceC11300zs1 String str, boolean z, FU.a aVar) {
        C9542sf.a((z && TextUtils.isEmpty(str)) ? false : true);
        this.a = aVar;
        this.b = str;
        this.c = z;
        this.d = new HashMap();
    }
}
