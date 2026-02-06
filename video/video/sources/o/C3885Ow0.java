package o;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: o.Ow0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3885Ow0 {

    /* renamed from: o.Ow0$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        void a(T t, Rect rect);
    }

    /* renamed from: o.Ow0$b */
    /* loaded from: classes.dex */
    public interface b<T, V> {
        V a(T t, int i);

        int b(T t);
    }

    /* renamed from: o.Ow0$c */
    /* loaded from: classes.dex */
    public static class c<T> implements Comparator<T> {
        public final Rect X = new Rect();
        public final Rect Y = new Rect();
        public final a<T> Y0;
        public final boolean Z;

        public c(boolean z, a<T> aVar) {
            this.Z = z;
            this.Y0 = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            Rect rect = this.X;
            Rect rect2 = this.Y;
            this.Y0.a(t, rect);
            this.Y0.a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                if (!this.Z) {
                    return -1;
                }
                return 1;
            } else if (i3 > i4) {
                if (this.Z) {
                    return -1;
                }
                return 1;
            } else {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    if (!this.Z) {
                        return -1;
                    }
                    return 1;
                } else if (i7 > i8) {
                    if (this.Z) {
                        return -1;
                    }
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    public static boolean a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean b2 = b(i, rect, rect2);
        if (b(i, rect, rect3) || !b2) {
            return false;
        }
        if (j(i, rect, rect3) && i != 17 && i != 66 && k(i, rect, rect2) >= m(i, rect, rect3)) {
            return false;
        }
        return true;
    }

    public static boolean b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static <L, T> T c(L l, b<L, T> bVar, a<T> aVar, T t, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        rect2.offset(0, -(rect.height() + 1));
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect2.offset(-(rect.width() + 1), 0);
                }
            } else {
                rect2.offset(0, rect.height() + 1);
            }
        } else {
            rect2.offset(rect.width() + 1, 0);
        }
        int b2 = bVar.b(l);
        Rect rect3 = new Rect();
        T t2 = null;
        for (int i2 = 0; i2 < b2; i2++) {
            T a2 = bVar.a(l, i2);
            if (a2 != t) {
                aVar.a(a2, rect3);
                if (h(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = a2;
                }
            }
        }
        return t2;
    }

    public static <L, T> T d(L l, b<L, T> bVar, a<T> aVar, T t, int i, boolean z, boolean z2) {
        int b2 = bVar.b(l);
        ArrayList arrayList = new ArrayList(b2);
        for (int i2 = 0; i2 < b2; i2++) {
            arrayList.add(bVar.a(l, i2));
        }
        Collections.sort(arrayList, new c(z, aVar));
        if (i != 1) {
            if (i == 2) {
                return (T) e(t, arrayList, z2);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return (T) f(t, arrayList, z2);
    }

    public static <T> T e(T t, ArrayList<T> arrayList, boolean z) {
        int lastIndexOf;
        int size = arrayList.size();
        if (t == null) {
            lastIndexOf = -1;
        } else {
            lastIndexOf = arrayList.lastIndexOf(t);
        }
        int i = lastIndexOf + 1;
        if (i < size) {
            return arrayList.get(i);
        }
        if (z && size > 0) {
            return arrayList.get(0);
        }
        return null;
    }

    public static <T> T f(T t, ArrayList<T> arrayList, boolean z) {
        int indexOf;
        int size = arrayList.size();
        if (t == null) {
            indexOf = size;
        } else {
            indexOf = arrayList.indexOf(t);
        }
        int i = indexOf - 1;
        if (i >= 0) {
            return arrayList.get(i);
        }
        if (z && size > 0) {
            return arrayList.get(size - 1);
        }
        return null;
    }

    public static int g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    public static boolean h(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!i(rect, rect2, i)) {
            return false;
        }
        if (!i(rect, rect3, i) || a(i, rect, rect2, rect3)) {
            return true;
        }
        if (a(i, rect, rect3, rect2) || g(k(i, rect, rect2), o(i, rect, rect2)) >= g(k(i, rect, rect3), o(i, rect, rect3))) {
            return false;
        }
        return true;
    }

    public static boolean i(Rect rect, Rect rect2, int i) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        int i2 = rect.top;
                        int i3 = rect2.top;
                        if ((i2 >= i3 && rect.bottom > i3) || rect.bottom >= rect2.bottom) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i4 = rect.left;
                int i5 = rect2.left;
                if ((i4 >= i5 && rect.right > i5) || rect.right >= rect2.right) {
                    return false;
                }
                return true;
            }
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            if ((i6 <= i7 && rect.top < i7) || rect.top <= rect2.top) {
                return false;
            }
            return true;
        }
        int i8 = rect.right;
        int i9 = rect2.right;
        if ((i8 <= i9 && rect.left < i9) || rect.left <= rect2.left) {
            return false;
        }
        return true;
    }

    public static boolean j(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        if (rect.bottom > rect2.top) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                } else if (rect.right > rect2.left) {
                    return false;
                } else {
                    return true;
                }
            } else if (rect.top < rect2.bottom) {
                return false;
            } else {
                return true;
            }
        } else if (rect.left < rect2.right) {
            return false;
        } else {
            return true;
        }
    }

    public static int k(int i, Rect rect, Rect rect2) {
        return Math.max(0, l(i, rect, rect2));
    }

    public static int l(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        i2 = rect2.top;
                        i3 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i2 = rect2.left;
                    i3 = rect.right;
                }
            } else {
                i2 = rect.top;
                i3 = rect2.bottom;
            }
        } else {
            i2 = rect.left;
            i3 = rect2.right;
        }
        return i2 - i3;
    }

    public static int m(int i, Rect rect, Rect rect2) {
        return Math.max(1, n(i, rect, rect2));
    }

    public static int n(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        i2 = rect2.bottom;
                        i3 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i2 = rect2.right;
                    i3 = rect.right;
                }
            } else {
                i2 = rect.top;
                i3 = rect2.top;
            }
        } else {
            i2 = rect.left;
            i3 = rect2.left;
        }
        return i2 - i3;
    }

    public static int o(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
