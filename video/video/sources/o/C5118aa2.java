package o;

import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@InterfaceC4238Sm
@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.aa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5118aa2 {
    public static <E extends Comparable> int a(List<? extends E> list, E e, c cVar, b bVar) {
        C10664xF1.E(e);
        return b(list, e, AbstractC10587ww1.z(), cVar, bVar);
    }

    public static <E> int b(List<? extends E> list, @InterfaceC7894ly1 E e, Comparator<? super E> comparator, c cVar, b bVar) {
        C10664xF1.E(comparator);
        C10664xF1.E(list);
        C10664xF1.E(cVar);
        C10664xF1.E(bVar);
        if (!(list instanceof RandomAccess)) {
            list = C10608x11.r(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int compare = comparator.compare(e, (E) list.get(i2));
            if (compare < 0) {
                size = i2 - 1;
            } else if (compare > 0) {
                i = i2 + 1;
            } else {
                return i + cVar.g(comparator, e, list.subList(i, size + 1), i2 - i);
            }
        }
        return bVar.g(i);
    }

    public static <E, K extends Comparable> int c(List<E> list, YA0<? super E, K> ya0, K k, c cVar, b bVar) {
        C10664xF1.E(k);
        return d(list, ya0, k, AbstractC10587ww1.z(), cVar, bVar);
    }

    public static <E, K> int d(List<E> list, YA0<? super E, K> ya0, @InterfaceC7894ly1 K k, Comparator<? super K> comparator, c cVar, b bVar) {
        return b(C10608x11.D(list, ya0), k, comparator, cVar, bVar);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.aa2$b */
    /* loaded from: classes3.dex */
    public static abstract class b {
        public static final b X = new a("NEXT_LOWER", 0);
        public static final b Y = new C0259b("NEXT_HIGHER", 1);
        public static final b Z = new c("INVERTED_INSERTION_INDEX", 2);
        public static final /* synthetic */ b[] Y0 = e();

        /* renamed from: o.aa2$b$a */
        /* loaded from: classes3.dex */
        public enum a extends b {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // o.C5118aa2.b
            public int g(int i) {
                return i - 1;
            }
        }

        /* renamed from: o.aa2$b$c */
        /* loaded from: classes3.dex */
        public enum c extends b {
            public c(String str, int i) {
                super(str, i);
            }

            @Override // o.C5118aa2.b
            public int g(int i) {
                return ~i;
            }
        }

        public b(String str, int i) {
        }

        public static /* synthetic */ b[] e() {
            return new b[]{X, Y, Z};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) Y0.clone();
        }

        public abstract int g(int i);

        /* renamed from: o.aa2$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public enum C0259b extends b {
            public C0259b(String str, int i) {
                super(str, i);
            }

            @Override // o.C5118aa2.b
            public int g(int i) {
                return i;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.aa2$c */
    /* loaded from: classes3.dex */
    public static abstract class c {
        public static final c X = new a("ANY_PRESENT", 0);
        public static final c Y = new b("LAST_PRESENT", 1);
        public static final c Z = new C0260c("FIRST_PRESENT", 2);
        public static final c Y0 = new d("FIRST_AFTER", 3);
        public static final c Z0 = new e("LAST_BEFORE", 4);
        public static final /* synthetic */ c[] a1 = e();

        /* renamed from: o.aa2$c$b */
        /* loaded from: classes3.dex */
        public enum b extends c {
            public b(String str, int i) {
                super(str, i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.C5118aa2.c
            public <E> int g(Comparator<? super E> comparator, @InterfaceC7894ly1 E e, List<? extends E> list, int i) {
                int size = list.size() - 1;
                while (i < size) {
                    int i2 = ((i + size) + 1) >>> 1;
                    if (comparator.compare((E) list.get(i2), e) > 0) {
                        size = i2 - 1;
                    } else {
                        i = i2;
                    }
                }
                return i;
            }
        }

        /* renamed from: o.aa2$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public enum C0260c extends c {
            public C0260c(String str, int i) {
                super(str, i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.C5118aa2.c
            public <E> int g(Comparator<? super E> comparator, @InterfaceC7894ly1 E e, List<? extends E> list, int i) {
                int i2 = 0;
                while (i2 < i) {
                    int i3 = (i2 + i) >>> 1;
                    if (comparator.compare((E) list.get(i3), e) < 0) {
                        i2 = i3 + 1;
                    } else {
                        i = i3;
                    }
                }
                return i2;
            }
        }

        /* renamed from: o.aa2$c$d */
        /* loaded from: classes3.dex */
        public enum d extends c {
            public d(String str, int i) {
                super(str, i);
            }

            @Override // o.C5118aa2.c
            public <E> int g(Comparator<? super E> comparator, @InterfaceC7894ly1 E e, List<? extends E> list, int i) {
                return c.Y.g(comparator, e, list, i) + 1;
            }
        }

        /* renamed from: o.aa2$c$e */
        /* loaded from: classes3.dex */
        public enum e extends c {
            public e(String str, int i) {
                super(str, i);
            }

            @Override // o.C5118aa2.c
            public <E> int g(Comparator<? super E> comparator, @InterfaceC7894ly1 E e, List<? extends E> list, int i) {
                return c.Z.g(comparator, e, list, i) - 1;
            }
        }

        public c(String str, int i) {
        }

        public static /* synthetic */ c[] e() {
            return new c[]{X, Y, Z, Y0, Z0};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) a1.clone();
        }

        public abstract <E> int g(Comparator<? super E> comparator, @InterfaceC7894ly1 E e2, List<? extends E> list, int i);

        /* renamed from: o.aa2$c$a */
        /* loaded from: classes3.dex */
        public enum a extends c {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // o.C5118aa2.c
            public <E> int g(Comparator<? super E> comparator, @InterfaceC7894ly1 E e, List<? extends E> list, int i) {
                return i;
            }
        }
    }
}
