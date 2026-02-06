package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhd;
import com.google.android.gms.internal.measurement.zzhf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzhd<MessageType extends zzhd<MessageType, BuilderType>, BuilderType extends zzhf<MessageType, BuilderType>> implements zzkj {
    protected int zza = 0;

    public static <T> void i(Iterable<T> iterable, List<? super T> list) {
        zziz.e(iterable);
        if (iterable instanceof zzjp) {
            List<?> b = ((zzjp) iterable).b();
            zzjp zzjpVar = (zzjp) list;
            int size = list.size();
            for (Object obj : b) {
                if (obj == null) {
                    String str = "Element at index " + (zzjpVar.size() - size) + " is null.";
                    for (int size2 = zzjpVar.size() - 1; size2 >= size; size2--) {
                        zzjpVar.remove(size2);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof zzhm) {
                    zzjpVar.n4((zzhm) obj);
                } else {
                    zzjpVar.add((String) obj);
                }
            }
        } else if (iterable instanceof zzkv) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T t : iterable) {
                if (t == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(t);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkj
    public final zzhm g() {
        try {
            zzhv F = zzhm.F(D0());
            b(F.b());
            return F.a();
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public int h(zzlb zzlbVar) {
        int j = j();
        if (j == -1) {
            int b = zzlbVar.b(this);
            l(b);
            return b;
        }
        return j;
    }

    public int j() {
        throw new UnsupportedOperationException();
    }

    public final byte[] k() {
        try {
            byte[] bArr = new byte[D0()];
            zzig H = zzig.H(bArr);
            b(H);
            H.I();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    public void l(int i) {
        throw new UnsupportedOperationException();
    }
}
