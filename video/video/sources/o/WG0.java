package o;

import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
public class WG0 {
    public String[] a = C4206Se.u;
    public InterfaceC7846lm1<String, Integer> b = new C11242ze();

    public void a() {
        this.a = C4206Se.u;
        this.b.clear();
    }

    public int b() {
        return this.a.length - 1;
    }

    public int[] c(String str) {
        Collection<Integer> collection = this.b.get(str);
        if (collection != null) {
            return C4206Se.K5((Integer[]) collection.toArray(C4206Se.n));
        }
        return C4206Se.m;
    }

    public String d(int i) {
        String[] strArr = this.a;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    public String[] e() {
        return (String[]) C4206Se.R(this.a);
    }

    public int f() {
        return this.a.length;
    }

    public void g(String[] strArr) {
        String[] strArr2;
        if (strArr != null) {
            strArr2 = (String[]) C4206Se.R(strArr);
        } else {
            strArr2 = C4206Se.u;
        }
        this.a = strArr2;
        this.b.clear();
        for (int i = 0; i < this.a.length; i++) {
            this.b.put(strArr[i], Integer.valueOf(i));
        }
    }

    public boolean h() {
        if (this.a.length == 0) {
            return true;
        }
        return false;
    }

    public void i(int i, String str) {
        String[] strArr = this.a;
        if (i >= strArr.length) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, i + 1);
            this.a = strArr2;
            strArr2[i] = str;
        }
        this.b.put(str, Integer.valueOf(i));
    }
}
