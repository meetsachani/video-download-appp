package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: o.lr2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7867lr2 {
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 4;
    public static final int h = 8;
    public static final int i = 16;
    public static final int j = 32;
    public static final int k = 64;
    public static final int l = 0;
    public static final int m = 1;
    public int a;
    public final List<String> b;
    public int c;

    /* renamed from: o.lr2$a */
    /* loaded from: classes.dex */
    public static class a {
        public int a = 0;
        public final List<String> b = new ArrayList();
        public int c = 1;

        public a a(Collection<String> collection) {
            this.b.addAll(collection);
            return this;
        }

        public a b(int... iArr) {
            for (int i : iArr) {
                this.a = i | this.a;
            }
            return this;
        }

        public a c(String... strArr) {
            this.b.addAll(Arrays.asList(strArr));
            return this;
        }

        public C7867lr2 d() {
            return new C7867lr2(this.a, this.b, this.c);
        }

        public a e(int i) {
            this.c = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.lr2$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.lr2$c */
    /* loaded from: classes.dex */
    public @interface c {
    }

    public C7867lr2(int i2, List<String> list, int i3) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = i2;
        arrayList.addAll(list);
        this.c = i3;
    }

    public List<String> a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.c;
    }
}
