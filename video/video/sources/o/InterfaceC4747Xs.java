package o;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: o.Xs  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4747Xs {

    /* renamed from: o.Xs$a */
    /* loaded from: classes.dex */
    public static class a {
        public byte[] a;
        public String b;
        public long c;
        public long d;
        public long e;
        public long f;
        public Map<String, String> g = Collections.EMPTY_MAP;
        public List<MG0> h;

        public boolean a() {
            return b(System.currentTimeMillis());
        }

        public boolean b(long j) {
            if (this.e < j) {
                return true;
            }
            return false;
        }

        public boolean c() {
            return d(System.currentTimeMillis());
        }

        public boolean d(long j) {
            if (this.f < j) {
                return true;
            }
            return false;
        }
    }

    void a(String str, boolean z);

    void b(String str, a aVar);

    void clear();

    void initialize();

    a m(String str);

    void remove(String str);
}
