package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhd;
import com.google.android.gms.internal.measurement.zzhf;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class zzhf<MessageType extends zzhd<MessageType, BuilderType>, BuilderType extends zzhf<MessageType, BuilderType>> implements zzkm {
    @Override // com.google.android.gms.internal.measurement.zzkm
    public final /* synthetic */ zzkm B0(byte[] bArr) throws zzji {
        return i(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final /* synthetic */ zzkm I1(byte[] bArr, zzik zzikVar) throws zzji {
        return j(bArr, 0, bArr.length, zzikVar);
    }

    @Override // 
    /* renamed from: h */
    public abstract BuilderType l(zzib zzibVar, zzik zzikVar) throws IOException;

    public BuilderType i(byte[] bArr, int i, int i2) throws zzji {
        try {
            zzib d = zzib.d(bArr, 0, i2, false);
            l(d, zzik.e);
            d.f(0);
            return this;
        } catch (zzji e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(k("byte array"), e2);
        }
    }

    public BuilderType j(byte[] bArr, int i, int i2, zzik zzikVar) throws zzji {
        try {
            zzib d = zzib.d(bArr, 0, i2, false);
            l(d, zzikVar);
            d.f(0);
            return this;
        } catch (zzji e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(k("byte array"), e2);
        }
    }

    public final String k(String str) {
        String name = getClass().getName();
        return "Reading " + name + " from a " + str + " threw an IOException (should never happen).";
    }

    @Override // 
    /* renamed from: m */
    public abstract BuilderType clone();
}
