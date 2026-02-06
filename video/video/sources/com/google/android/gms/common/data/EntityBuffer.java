package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    public boolean Y;
    public ArrayList<Integer> Z;

    @KeepForSdk
    public EntityBuffer(@InterfaceC5670cr1 DataHolder dataHolder) {
        super(dataHolder);
        this.Y = false;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public String d() {
        return null;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public abstract T f(int i, int i2);

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @InterfaceC5670cr1
    @KeepForSdk
    public final T get(int i) {
        int intValue;
        int intValue2;
        j();
        int i2 = i(i);
        int i3 = 0;
        if (i >= 0 && i != this.Z.size()) {
            if (i == this.Z.size() - 1) {
                intValue = ((DataHolder) Preconditions.r(this.X)).getCount();
                intValue2 = this.Z.get(i).intValue();
            } else {
                intValue = this.Z.get(i + 1).intValue();
                intValue2 = this.Z.get(i).intValue();
            }
            int i4 = intValue - intValue2;
            if (i4 == 1) {
                int i5 = i(i);
                int U0 = ((DataHolder) Preconditions.r(this.X)).U0(i5);
                String d = d();
                if (d == null || this.X.S0(d, i5, U0) != null) {
                    i3 = 1;
                }
            } else {
                i3 = i4;
            }
        }
        return f(i2, i3);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public int getCount() {
        j();
        return this.Z.size();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public abstract String h();

    public final int i(int i) {
        if (i >= 0 && i < this.Z.size()) {
            return this.Z.get(i).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(i);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void j() {
        synchronized (this) {
            try {
                if (!this.Y) {
                    int count = ((DataHolder) Preconditions.r(this.X)).getCount();
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    this.Z = arrayList;
                    if (count > 0) {
                        arrayList.add(0);
                        String h = h();
                        String S0 = this.X.S0(h, 0, this.X.U0(0));
                        for (int i = 1; i < count; i++) {
                            int U0 = this.X.U0(i);
                            String S02 = this.X.S0(h, i, U0);
                            if (S02 != null) {
                                if (!S02.equals(S0)) {
                                    this.Z.add(Integer.valueOf(i));
                                    S0 = S02;
                                }
                            } else {
                                StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 78);
                                sb.append("Missing value for markerColumn: ");
                                sb.append(h);
                                sb.append(", at row: ");
                                sb.append(i);
                                sb.append(", for window: ");
                                sb.append(U0);
                                throw new NullPointerException(sb.toString());
                            }
                        }
                    }
                    this.Y = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
