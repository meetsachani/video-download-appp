package o;

import java.io.File;
import o.Y30;

/* renamed from: o.e40  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5964e40 implements Y30.a {
    public final long c;
    public final c d;

    /* renamed from: o.e40$a */
    /* loaded from: classes.dex */
    public class a implements c {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // o.C5964e40.c
        public File a() {
            return new File(this.a);
        }
    }

    /* renamed from: o.e40$b */
    /* loaded from: classes.dex */
    public class b implements c {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // o.C5964e40.c
        public File a() {
            return new File(this.a, this.b);
        }
    }

    /* renamed from: o.e40$c */
    /* loaded from: classes.dex */
    public interface c {
        File a();
    }

    public C5964e40(String str, long j) {
        this(new a(str), j);
    }

    @Override // o.Y30.a
    public Y30 build() {
        File a2 = this.d.a();
        if (a2 == null) {
            return null;
        }
        if (!a2.isDirectory() && !a2.mkdirs()) {
            return null;
        }
        return C6207f40.d(a2, this.c);
    }

    public C5964e40(String str, String str2, long j) {
        this(new b(str, str2), j);
    }

    public C5964e40(c cVar, long j) {
        this.c = j;
        this.d = cVar;
    }
}
