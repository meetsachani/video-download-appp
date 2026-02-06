package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: o.lD2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7713lD2 {
    public final UH2 a;
    public final List<androidx.camera.core.m> b;
    public final List<AbstractC4078Qw> c;

    /* renamed from: o.lD2$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static final List<Integer> d = Arrays.asList(1, 2, 4, 3, 7);
        public UH2 a;
        public final List<androidx.camera.core.m> b = new ArrayList();
        public final List<AbstractC4078Qw> c = new ArrayList();

        public a a(AbstractC4078Qw abstractC4078Qw) {
            this.c.add(abstractC4078Qw);
            return this;
        }

        public a b(androidx.camera.core.m mVar) {
            this.b.add(mVar);
            return this;
        }

        public C7713lD2 c() {
            C10907yF1.b(!this.b.isEmpty(), "UseCase must not be empty.");
            d();
            return new C7713lD2(this.a, this.b, this.c);
        }

        public final void d() {
            int i = 0;
            for (AbstractC4078Qw abstractC4078Qw : this.c) {
                int f = abstractC4078Qw.f();
                C3553Ll2.a(d, f);
                int i2 = i & f;
                if (i2 <= 0) {
                    i |= f;
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "More than one effects has targets %s.", C3553Ll2.b(i2)));
                }
            }
        }

        public a e(UH2 uh2) {
            this.a = uh2;
            return this;
        }
    }

    public C7713lD2(UH2 uh2, List<androidx.camera.core.m> list, List<AbstractC4078Qw> list2) {
        this.a = uh2;
        this.b = list;
        this.c = list2;
    }

    public List<AbstractC4078Qw> a() {
        return this.c;
    }

    public List<androidx.camera.core.m> b() {
        return this.b;
    }

    public UH2 c() {
        return this.a;
    }
}
