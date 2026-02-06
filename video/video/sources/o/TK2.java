package o;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class TK2 extends UK {
    public ArrayList<UK> B1;

    public TK2() {
        this.B1 = new ArrayList<>();
    }

    @Override // o.UK
    public void R0() {
        this.B1.clear();
        super.R0();
    }

    @Override // o.UK
    public void R1(int i, int i2) {
        super.R1(i, i2);
        int size = this.B1.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.B1.get(i3).R1(Y(), Z());
        }
    }

    @Override // o.UK
    public void W0(C5191at c5191at) {
        super.W0(c5191at);
        int size = this.B1.size();
        for (int i = 0; i < size; i++) {
            this.B1.get(i).W0(c5191at);
        }
    }

    public void a(UK uk) {
        this.B1.add(uk);
        if (uk.U() != null) {
            ((TK2) uk.U()).p2(uk);
        }
        uk.T1(this);
    }

    public void l2(UK... ukArr) {
        for (UK uk : ukArr) {
            a(uk);
        }
    }

    public ArrayList<UK> m2() {
        return this.B1;
    }

    public VK n2() {
        VK vk;
        UK U = U();
        if (this instanceof VK) {
            vk = (VK) this;
        } else {
            vk = null;
        }
        while (U != null) {
            UK U2 = U.U();
            if (U instanceof VK) {
                vk = (VK) U;
            }
            U = U2;
        }
        return vk;
    }

    public void o2() {
        ArrayList<UK> arrayList = this.B1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                UK uk = this.B1.get(i);
                if (uk instanceof TK2) {
                    ((TK2) uk).o2();
                }
            }
        }
    }

    public void p2(UK uk) {
        this.B1.remove(uk);
        uk.R0();
    }

    public void q2() {
        this.B1.clear();
    }

    public TK2(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.B1 = new ArrayList<>();
    }

    public TK2(int i, int i2) {
        super(i, i2);
        this.B1 = new ArrayList<>();
    }
}
