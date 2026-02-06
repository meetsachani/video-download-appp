package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.c;
import androidx.emoji2.text.f;
import java.util.Arrays;
import java.util.Set;
import o.AbstractC3115Ha0;
import o.C11074yw2;
import o.C9033qa2;
import o.OB2;

/* loaded from: classes.dex */
public final class d {
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 16;
    public final c.m a;
    public final androidx.emoji2.text.f b;
    public c.f c;
    public final boolean d;
    public final int[] e;

    /* loaded from: classes.dex */
    public static final class a {
        public static final int a = -1;

        public static int a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        if (z) {
                            return -1;
                        }
                        return 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z = true;
                    }
                }
                return i;
            }
        }

        public static int b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                        i++;
                    } else if (Character.isLowSurrogate(charAt)) {
                        return -1;
                    } else {
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements c<OB2> {
        public OB2 a;
        public final c.m b;

        public b(OB2 ob2, c.m mVar) {
            this.a = ob2;
            this.b = mVar;
        }

        @Override // androidx.emoji2.text.d.c
        public boolean a(CharSequence charSequence, int i, int i2, C11074yw2 c11074yw2) {
            Spannable spannableString;
            if (c11074yw2.m()) {
                return true;
            }
            if (this.a == null) {
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                this.a = new OB2(spannableString);
            }
            this.a.setSpan(this.b.a(c11074yw2), i, i2, 33);
            return true;
        }

        @Override // androidx.emoji2.text.d.c
        /* renamed from: b */
        public OB2 getResult() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public interface c<T> {
        boolean a(CharSequence charSequence, int i, int i2, C11074yw2 c11074yw2);

        T getResult();
    }

    /* renamed from: androidx.emoji2.text.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0023d implements c<C0023d> {
        public final int a;
        public int b = -1;
        public int c = -1;

        public C0023d(int i) {
            this.a = i;
        }

        @Override // androidx.emoji2.text.d.c
        public boolean a(CharSequence charSequence, int i, int i2, C11074yw2 c11074yw2) {
            int i3 = this.a;
            if (i <= i3 && i3 < i2) {
                this.b = i;
                this.c = i2;
                return false;
            } else if (i2 > i3) {
                return false;
            } else {
                return true;
            }
        }

        @Override // androidx.emoji2.text.d.c
        /* renamed from: b */
        public C0023d getResult() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class e implements c<e> {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        @Override // androidx.emoji2.text.d.c
        public boolean a(CharSequence charSequence, int i, int i2, C11074yw2 c11074yw2) {
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
                return true;
            }
            c11074yw2.o(true);
            return false;
        }

        @Override // androidx.emoji2.text.d.c
        /* renamed from: b */
        public e getResult() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {
        public static final int i = 1;
        public static final int j = 2;
        public int a = 1;
        public final f.a b;
        public f.a c;
        public f.a d;
        public int e;
        public int f;
        public final boolean g;
        public final int[] h;

        public f(f.a aVar, boolean z, int[] iArr) {
            this.b = aVar;
            this.c = aVar;
            this.g = z;
            this.h = iArr;
        }

        public static boolean d(int i2) {
            return i2 == 65039;
        }

        public static boolean f(int i2) {
            return i2 == 65038;
        }

        public int a(int i2) {
            f.a a = this.c.a(i2);
            int i3 = 2;
            if (this.a != 2) {
                if (a == null) {
                    i3 = g();
                } else {
                    this.a = 2;
                    this.c = a;
                    this.f = 1;
                }
            } else if (a != null) {
                this.c = a;
                this.f++;
            } else if (f(i2)) {
                i3 = g();
            } else if (!d(i2)) {
                if (this.c.b() != null) {
                    i3 = 3;
                    if (this.f == 1) {
                        if (h()) {
                            this.d = this.c;
                            g();
                        } else {
                            i3 = g();
                        }
                    } else {
                        this.d = this.c;
                        g();
                    }
                } else {
                    i3 = g();
                }
            }
            this.e = i2;
            return i3;
        }

        public C11074yw2 b() {
            return this.c.b();
        }

        public C11074yw2 c() {
            return this.d.b();
        }

        public boolean e() {
            if (this.a == 2 && this.c.b() != null) {
                if (this.f > 1 || h()) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public final int g() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
            return 1;
        }

        public final boolean h() {
            if (this.c.b().l() || d(this.e)) {
                return true;
            }
            if (this.g) {
                if (this.h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.h, this.c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public d(androidx.emoji2.text.f fVar, c.m mVar, c.f fVar2, boolean z, int[] iArr, Set<int[]> set) {
        this.a = mVar;
        this.b = fVar;
        this.c = fVar2;
        this.d = z;
        this.e = iArr;
        k(set);
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        AbstractC3115Ha0[] abstractC3115Ha0Arr;
        if (j(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!i(selectionStart, selectionEnd) && (abstractC3115Ha0Arr = (AbstractC3115Ha0[]) editable.getSpans(selectionStart, selectionEnd, AbstractC3115Ha0.class)) != null && abstractC3115Ha0Arr.length > 0) {
            for (AbstractC3115Ha0 abstractC3115Ha0 : abstractC3115Ha0Arr) {
                int spanStart = editable.getSpanStart(abstractC3115Ha0);
                int spanEnd = editable.getSpanEnd(abstractC3115Ha0);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i2 >= 0 && i3 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (i(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                max = a.a(editable, selectionStart, Math.max(i2, 0));
                min = a.b(editable, selectionEnd, Math.max(i3, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i2, 0);
                min = Math.min(selectionEnd + i3, editable.length());
            }
            AbstractC3115Ha0[] abstractC3115Ha0Arr = (AbstractC3115Ha0[]) editable.getSpans(max, min, AbstractC3115Ha0.class);
            if (abstractC3115Ha0Arr != null && abstractC3115Ha0Arr.length > 0) {
                for (AbstractC3115Ha0 abstractC3115Ha0 : abstractC3115Ha0Arr) {
                    int spanStart = editable.getSpanStart(abstractC3115Ha0);
                    int spanEnd = editable.getSpanEnd(abstractC3115Ha0);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean g(Editable editable, int i2, KeyEvent keyEvent) {
        boolean a2;
        if (i2 != 67) {
            if (i2 != 112) {
                a2 = false;
            } else {
                a2 = a(editable, keyEvent, true);
            }
        } else {
            a2 = a(editable, keyEvent, false);
        }
        if (!a2) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public static boolean i(int i2, int i3) {
        return i2 == -1 || i3 == -1 || i2 != i3;
    }

    public static boolean j(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public int b(CharSequence charSequence, int i2) {
        if (i2 >= 0 && i2 < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                AbstractC3115Ha0[] abstractC3115Ha0Arr = (AbstractC3115Ha0[]) spanned.getSpans(i2, i2 + 1, AbstractC3115Ha0.class);
                if (abstractC3115Ha0Arr.length > 0) {
                    return spanned.getSpanEnd(abstractC3115Ha0Arr[0]);
                }
            }
            return ((C0023d) m(charSequence, Math.max(0, i2 - 16), Math.min(charSequence.length(), i2 + 16), Integer.MAX_VALUE, true, new C0023d(i2))).c;
        }
        return -1;
    }

    public int c(CharSequence charSequence) {
        return d(charSequence, this.b.h());
    }

    public int d(CharSequence charSequence, int i2) {
        f fVar = new f(this.b.i(), this.d, this.e);
        int length = charSequence.length();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            int codePointAt = Character.codePointAt(charSequence, i3);
            int a2 = fVar.a(codePointAt);
            C11074yw2 b2 = fVar.b();
            if (a2 != 1) {
                if (a2 != 2) {
                    if (a2 == 3) {
                        b2 = fVar.c();
                        if (b2.d() <= i2) {
                            i4++;
                        }
                    }
                } else {
                    i3 += Character.charCount(codePointAt);
                }
            } else {
                i3 += Character.charCount(codePointAt);
                i5 = 0;
            }
            if (b2 != null && b2.d() <= i2) {
                i5++;
            }
        }
        if (i4 != 0) {
            return 2;
        }
        if (fVar.e() && fVar.b().d() <= i2) {
            return 1;
        }
        if (i5 == 0) {
            return 0;
        }
        return 2;
    }

    public int e(CharSequence charSequence, int i2) {
        if (i2 >= 0 && i2 < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                AbstractC3115Ha0[] abstractC3115Ha0Arr = (AbstractC3115Ha0[]) spanned.getSpans(i2, i2 + 1, AbstractC3115Ha0.class);
                if (abstractC3115Ha0Arr.length > 0) {
                    return spanned.getSpanStart(abstractC3115Ha0Arr[0]);
                }
            }
            return ((C0023d) m(charSequence, Math.max(0, i2 - 16), Math.min(charSequence.length(), i2 + 16), Integer.MAX_VALUE, true, new C0023d(i2))).b;
        }
        return -1;
    }

    public final boolean h(CharSequence charSequence, int i2, int i3, C11074yw2 c11074yw2) {
        if (c11074yw2.e() == 0) {
            c11074yw2.p(this.c.a(charSequence, i2, i3, c11074yw2.i()));
        }
        if (c11074yw2.e() == 2) {
            return true;
        }
        return false;
    }

    public final void k(Set<int[]> set) {
        if (!set.isEmpty()) {
            for (int[] iArr : set) {
                String str = new String(iArr, 0, iArr.length);
                m(str, 0, str.length(), 1, true, new e(str));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a7, code lost:
        if (r1 != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:69:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CharSequence l(CharSequence charSequence, int i2, int i3, int i4, boolean z) {
        OB2 ob2;
        CharSequence charSequence2;
        Throwable th;
        int i5;
        int i6;
        AbstractC3115Ha0[] abstractC3115Ha0Arr;
        boolean z2 = charSequence instanceof C9033qa2;
        if (z2) {
            ((C9033qa2) charSequence).b();
        }
        try {
            if (!z2) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i2 - 1, i3 + 1, AbstractC3115Ha0.class) <= i3) {
                            ob2 = new OB2(charSequence);
                        } else {
                            ob2 = null;
                        }
                        if (ob2 != null && (abstractC3115Ha0Arr = (AbstractC3115Ha0[]) ob2.getSpans(i2, i3, AbstractC3115Ha0.class)) != null && abstractC3115Ha0Arr.length > 0) {
                            for (AbstractC3115Ha0 abstractC3115Ha0 : abstractC3115Ha0Arr) {
                                int spanStart = ob2.getSpanStart(abstractC3115Ha0);
                                int spanEnd = ob2.getSpanEnd(abstractC3115Ha0);
                                if (spanStart != i3) {
                                    ob2.removeSpan(abstractC3115Ha0);
                                }
                                i2 = Math.min(spanStart, i2);
                                i3 = Math.max(spanEnd, i3);
                            }
                        }
                        i5 = i2;
                        i6 = i3;
                        if (i5 != i6 || i5 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z2) {
                                return charSequence2;
                            }
                        } else {
                            if (i4 != Integer.MAX_VALUE && ob2 != null) {
                                i4 -= ((AbstractC3115Ha0[]) ob2.getSpans(0, ob2.length(), AbstractC3115Ha0.class)).length;
                            }
                            charSequence2 = charSequence;
                            try {
                                OB2 ob22 = (OB2) m(charSequence2, i5, i6, i4, z, new b(ob2, this.a));
                                if (ob22 != null) {
                                    Spannable b2 = ob22.b();
                                    if (z2) {
                                        ((C9033qa2) charSequence2).e();
                                    }
                                    return b2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                if (z2) {
                                }
                                throw th;
                            }
                        }
                        ((C9033qa2) charSequence2).e();
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    if (z2) {
                    }
                    throw th;
                }
            }
            ob2 = new OB2((Spannable) charSequence);
            if (ob2 != null) {
                while (r6 < r5) {
                }
            }
            i5 = i2;
            i6 = i3;
            if (i5 != i6) {
            }
            charSequence2 = charSequence;
            if (!z2) {
            }
            ((C9033qa2) charSequence2).e();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
            th = th;
            if (z2) {
                ((C9033qa2) charSequence2).e();
            }
            throw th;
        }
    }

    public final <T> T m(CharSequence charSequence, int i2, int i3, int i4, boolean z, c<T> cVar) {
        int i5;
        f fVar = new f(this.b.i(), this.d, this.e);
        int i6 = 0;
        boolean z2 = true;
        int codePointAt = Character.codePointAt(charSequence, i2);
        loop0: while (true) {
            i5 = i2;
            while (i2 < i3 && i6 < i4 && z2) {
                int a2 = fVar.a(codePointAt);
                if (a2 != 1) {
                    if (a2 != 2) {
                        if (a2 == 3) {
                            if (z || !h(charSequence, i5, i2, fVar.c())) {
                                z2 = cVar.a(charSequence, i5, i2, fVar.c());
                                i6++;
                            }
                        }
                    } else {
                        i2 += Character.charCount(codePointAt);
                        if (i2 < i3) {
                            codePointAt = Character.codePointAt(charSequence, i2);
                        }
                    }
                } else {
                    i5 += Character.charCount(Character.codePointAt(charSequence, i5));
                    if (i5 < i3) {
                        codePointAt = Character.codePointAt(charSequence, i5);
                    }
                    i2 = i5;
                }
            }
        }
        if (fVar.e() && i6 < i4 && z2 && (z || !h(charSequence, i5, i2, fVar.b()))) {
            cVar.a(charSequence, i5, i2, fVar.b());
        }
        return cVar.getResult();
    }
}
