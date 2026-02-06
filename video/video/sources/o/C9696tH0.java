package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: o.tH0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9696tH0 extends UK implements InterfaceC8961qH0 {
    public UK[] B1 = new UK[4];
    public int C1 = 0;

    @Override // o.InterfaceC8961qH0
    public void a(UK uk) {
        if (uk != this && uk != null) {
            int i = this.C1 + 1;
            UK[] ukArr = this.B1;
            if (i > ukArr.length) {
                this.B1 = (UK[]) Arrays.copyOf(ukArr, ukArr.length * 2);
            }
            UK[] ukArr2 = this.B1;
            int i2 = this.C1;
            ukArr2[i2] = uk;
            this.C1 = i2 + 1;
        }
    }

    @Override // o.InterfaceC8961qH0
    public void c() {
        this.C1 = 0;
        Arrays.fill(this.B1, (Object) null);
    }

    public void l2(ArrayList<VK2> arrayList, int i, VK2 vk2) {
        for (int i2 = 0; i2 < this.C1; i2++) {
            vk2.a(this.B1[i2]);
        }
        for (int i3 = 0; i3 < this.C1; i3++) {
            VE0.a(this.B1[i3], i, arrayList, vk2);
        }
    }

    public int m2(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.C1; i4++) {
            UK uk = this.B1[i4];
            if (i == 0 && (i3 = uk.S0) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = uk.T0) != -1) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.UK
    public void n(UK uk, HashMap<UK, UK> hashMap) {
        super.n(uk, hashMap);
        C9696tH0 c9696tH0 = (C9696tH0) uk;
        this.C1 = 0;
        int i = c9696tH0.C1;
        for (int i2 = 0; i2 < i; i2++) {
            a(hashMap.get(c9696tH0.B1[i2]));
        }
    }

    public void b(VK vk) {
    }
}
