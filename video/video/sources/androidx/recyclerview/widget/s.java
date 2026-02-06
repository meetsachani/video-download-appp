package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0371a;
import java.util.List;

/* loaded from: classes.dex */
public class s {
    public final a a;

    /* loaded from: classes.dex */
    public interface a {
        C0371a.b a(int i, int i2, int i3, Object obj);

        void b(C0371a.b bVar);
    }

    public s(a aVar) {
        this.a = aVar;
    }

    public final int a(List<C0371a.b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).a == 8) {
                if (z) {
                    return size;
                }
            } else {
                z = true;
            }
        }
        return -1;
    }

    public void b(List<C0371a.b> list) {
        while (true) {
            int a2 = a(list);
            if (a2 != -1) {
                d(list, a2, a2 + 1);
            } else {
                return;
            }
        }
    }

    public final void c(List<C0371a.b> list, int i, C0371a.b bVar, int i2, C0371a.b bVar2) {
        int i3;
        int i4 = bVar.d;
        int i5 = bVar2.b;
        if (i4 < i5) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        int i6 = bVar.b;
        if (i6 < i5) {
            i3++;
        }
        if (i5 <= i6) {
            bVar.b = i6 + bVar2.d;
        }
        int i7 = bVar2.b;
        if (i7 <= i4) {
            bVar.d = i4 + bVar2.d;
        }
        bVar2.b = i7 + i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    public final void d(List<C0371a.b> list, int i, int i2) {
        C0371a.b bVar = list.get(i);
        C0371a.b bVar2 = list.get(i2);
        int i3 = bVar2.a;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 4) {
                    return;
                }
                f(list, i, bVar, i2, bVar2);
                return;
            }
            e(list, i, bVar, i2, bVar2);
            return;
        }
        c(list, i, bVar, i2, bVar2);
    }

    public void e(List<C0371a.b> list, int i, C0371a.b bVar, int i2, C0371a.b bVar2) {
        boolean z;
        int i3 = bVar.b;
        int i4 = bVar.d;
        boolean z2 = false;
        if (i3 < i4) {
            if (bVar2.b == i3 && bVar2.d == i4 - i3) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (bVar2.b == i4 + 1 && bVar2.d == i3 - i4) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i5 = bVar2.b;
        if (i4 < i5) {
            bVar2.b = i5 - 1;
        } else {
            int i6 = bVar2.d;
            if (i4 < i5 + i6) {
                bVar2.d = i6 - 1;
                bVar.a = 2;
                bVar.d = 1;
                if (bVar2.d == 0) {
                    list.remove(i2);
                    this.a.b(bVar2);
                    return;
                }
                return;
            }
        }
        int i7 = bVar.b;
        int i8 = bVar2.b;
        C0371a.b bVar3 = null;
        if (i7 <= i8) {
            bVar2.b = i8 + 1;
        } else {
            int i9 = bVar2.d;
            if (i7 < i8 + i9) {
                bVar3 = this.a.a(2, i7 + 1, (i8 + i9) - i7, null);
                bVar2.d = bVar.b - bVar2.b;
            }
        }
        if (z2) {
            list.set(i, bVar2);
            list.remove(i2);
            this.a.b(bVar);
            return;
        }
        if (z) {
            if (bVar3 != null) {
                int i10 = bVar.b;
                if (i10 > bVar3.b) {
                    bVar.b = i10 - bVar3.d;
                }
                int i11 = bVar.d;
                if (i11 > bVar3.b) {
                    bVar.d = i11 - bVar3.d;
                }
            }
            int i12 = bVar.b;
            if (i12 > bVar2.b) {
                bVar.b = i12 - bVar2.d;
            }
            int i13 = bVar.d;
            if (i13 > bVar2.b) {
                bVar.d = i13 - bVar2.d;
            }
        } else {
            if (bVar3 != null) {
                int i14 = bVar.b;
                if (i14 >= bVar3.b) {
                    bVar.b = i14 - bVar3.d;
                }
                int i15 = bVar.d;
                if (i15 >= bVar3.b) {
                    bVar.d = i15 - bVar3.d;
                }
            }
            int i16 = bVar.b;
            if (i16 >= bVar2.b) {
                bVar.b = i16 - bVar2.d;
            }
            int i17 = bVar.d;
            if (i17 >= bVar2.b) {
                bVar.d = i17 - bVar2.d;
            }
        }
        list.set(i, bVar2);
        if (bVar.b != bVar.d) {
            list.set(i2, bVar);
        } else {
            list.remove(i2);
        }
        if (bVar3 != null) {
            list.add(i, bVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(List<C0371a.b> list, int i, C0371a.b bVar, int i2, C0371a.b bVar2) {
        C0371a.b a2;
        int i3;
        int i4;
        int i5 = bVar.d;
        int i6 = bVar2.b;
        C0371a.b bVar3 = null;
        if (i5 < i6) {
            bVar2.b = i6 - 1;
        } else {
            int i7 = bVar2.d;
            if (i5 < i6 + i7) {
                bVar2.d = i7 - 1;
                a2 = this.a.a(4, bVar.b, 1, bVar2.c);
                i3 = bVar.b;
                i4 = bVar2.b;
                if (i3 > i4) {
                    bVar2.b = i4 + 1;
                } else {
                    int i8 = bVar2.d;
                    if (i3 < i4 + i8) {
                        int i9 = (i4 + i8) - i3;
                        bVar3 = this.a.a(4, i3 + 1, i9, bVar2.c);
                        bVar2.d -= i9;
                    }
                }
                list.set(i2, bVar);
                if (bVar2.d <= 0) {
                    list.set(i, bVar2);
                } else {
                    list.remove(i);
                    this.a.b(bVar2);
                }
                if (a2 != null) {
                    list.add(i, a2);
                }
                if (bVar3 == null) {
                    list.add(i, bVar3);
                    return;
                }
                return;
            }
        }
        a2 = null;
        i3 = bVar.b;
        i4 = bVar2.b;
        if (i3 > i4) {
        }
        list.set(i2, bVar);
        if (bVar2.d <= 0) {
        }
        if (a2 != null) {
        }
        if (bVar3 == null) {
        }
    }
}
