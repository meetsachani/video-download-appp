package o;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

@Deprecated
/* renamed from: o.qt  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9106qt {
    public static final String f = "CachedContent";
    public final int a;
    public final String b;
    public final TreeSet<K72> c;
    public final ArrayList<a> d;
    public C9759tY e;

    /* renamed from: o.qt$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public boolean a(long j, long j2) {
            long j3 = this.b;
            if (j3 == -1) {
                if (j >= this.a) {
                    return true;
                }
                return false;
            } else if (j2 == -1) {
                return false;
            } else {
                long j4 = this.a;
                if (j4 <= j && j + j2 <= j4 + j3) {
                    return true;
                }
                return false;
            }
        }

        public boolean b(long j, long j2) {
            long j3 = this.a;
            if (j3 <= j) {
                long j4 = this.b;
                if (j4 == -1 || j3 + j4 > j) {
                    return true;
                }
                return false;
            } else if (j2 == -1 || j + j2 > j3) {
                return true;
            } else {
                return false;
            }
        }
    }

    public C9106qt(int i, String str) {
        this(i, str, C9759tY.f);
    }

    public void a(K72 k72) {
        this.c.add(k72);
    }

    public boolean b(C6533gM c6533gM) {
        C9759tY c9759tY = this.e;
        C9759tY h = c9759tY.h(c6533gM);
        this.e = h;
        return !h.equals(c9759tY);
    }

    public long c(long j, long j2) {
        boolean z;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        if (j2 < 0) {
            z2 = false;
        }
        C9542sf.a(z2);
        K72 e = e(j, j2);
        long j3 = Long.MAX_VALUE;
        if (e.g()) {
            if (!e.h()) {
                j3 = e.Z;
            }
            return -Math.min(j3, j2);
        }
        long j4 = j + j2;
        if (j4 >= 0) {
            j3 = j4;
        }
        long j5 = e.Y + e.Z;
        if (j5 < j3) {
            for (K72 k72 : this.c.tailSet(e, false)) {
                long j6 = k72.Y;
                if (j6 > j5) {
                    break;
                }
                j5 = Math.max(j5, j6 + k72.Z);
                if (j5 >= j3) {
                    break;
                }
            }
        }
        return Math.min(j5 - j, j2);
    }

    public C9759tY d() {
        return this.e;
    }

    public K72 e(long j, long j2) {
        K72 n = K72.n(this.b, j);
        K72 floor = this.c.floor(n);
        if (floor != null && floor.Y + floor.Z > j) {
            return floor;
        }
        K72 ceiling = this.c.ceiling(n);
        if (ceiling != null) {
            long j3 = ceiling.Y - j;
            if (j2 == -1) {
                j2 = j3;
            } else {
                j2 = Math.min(j3, j2);
            }
        }
        return K72.m(this.b, j, j2);
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9106qt.class == obj.getClass()) {
            C9106qt c9106qt = (C9106qt) obj;
            if (this.a == c9106qt.a && this.b.equals(c9106qt.b) && this.c.equals(c9106qt.c) && this.e.equals(c9106qt.e)) {
                return true;
            }
        }
        return false;
    }

    public TreeSet<K72> f() {
        return this.c;
    }

    public boolean g() {
        return this.c.isEmpty();
    }

    public boolean h(long j, long j2) {
        for (int i = 0; i < this.d.size(); i++) {
            if (this.d.get(i).a(j, j2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.e.hashCode();
    }

    public boolean i() {
        return this.d.isEmpty();
    }

    public boolean j(long j, long j2) {
        for (int i = 0; i < this.d.size(); i++) {
            if (this.d.get(i).b(j, j2)) {
                return false;
            }
        }
        this.d.add(new a(j, j2));
        return true;
    }

    public boolean k(C8376nt c8376nt) {
        if (this.c.remove(c8376nt)) {
            File file = c8376nt.Z0;
            if (file != null) {
                file.delete();
                return true;
            }
            return true;
        }
        return false;
    }

    public K72 l(K72 k72, long j, boolean z) {
        long j2;
        C9542sf.i(this.c.remove(k72));
        File file = (File) C9542sf.g(k72.Z0);
        if (z) {
            j2 = j;
            File o2 = K72.o((File) C9542sf.g(file.getParentFile()), this.a, k72.Y, j2);
            if (file.renameTo(o2)) {
                file = o2;
            } else {
                I31.n(f, "Failed to rename " + file + " to " + o2);
            }
        } else {
            j2 = j;
        }
        K72 i = k72.i(file, j2);
        this.c.add(i);
        return i;
    }

    public void m(long j) {
        for (int i = 0; i < this.d.size(); i++) {
            if (this.d.get(i).a == j) {
                this.d.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public C9106qt(int i, String str, C9759tY c9759tY) {
        this.a = i;
        this.b = str;
        this.e = c9759tY;
        this.c = new TreeSet<>();
        this.d = new ArrayList<>();
    }
}
