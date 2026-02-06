package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.C7828li;

/* renamed from: o.nh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8328nh {
    public static final List<Integer> a = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    /* renamed from: o.nh$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract AbstractC8328nh a();

        public final AbstractC8328nh b() {
            AbstractC8328nh a = a();
            String str = "";
            if (a.c() == -1) {
                str = " audioSource";
            }
            if (a.f() <= 0) {
                str = str + " sampleRate";
            }
            if (a.e() <= 0) {
                str = str + " channelCount";
            }
            if (a.b() == -1) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return a;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:" + str);
        }

        public abstract a c(int i);

        public abstract a d(int i);

        public abstract a e(int i);

        public abstract a f(int i);
    }

    public static a a() {
        return new C7828li.b().d(-1).f(-1).e(-1).c(-1);
    }

    public abstract int b();

    public abstract int c();

    public int d() {
        return C4021Qh.e(b(), e());
    }

    public abstract int e();

    public abstract int f();

    public abstract a g();
}
