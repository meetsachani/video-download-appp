package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgym;
import com.google.android.gms.internal.ads.zzgys;
import java.io.IOException;

/* loaded from: classes2.dex */
public class zzgym<MessageType extends zzgys<MessageType, BuilderType>, BuilderType extends zzgym<MessageType, BuilderType>> extends zzgws<MessageType, BuilderType> {
    public final MessageType X;
    public MessageType Y;

    public zzgym(MessageType messagetype) {
        this.X = messagetype;
        if (!messagetype.i2()) {
            this.Y = G1();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public static <MessageType> void H1(MessageType messagetype, MessageType messagetype2) {
        zzhan.a().b(messagetype.getClass()).h(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final boolean D0() {
        boolean r2;
        r2 = zzgys.r2(this.Y, false);
        return r2;
    }

    public final MessageType G1() {
        return (MessageType) this.X.P1();
    }

    public final BuilderType J1() {
        if (!this.X.i2()) {
            this.Y = G1();
            return this;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    @Override // com.google.android.gms.internal.ads.zzgws
    /* renamed from: K1 */
    public BuilderType m1() {
        BuilderType buildertype = (BuilderType) R0().V0();
        buildertype.Y = o3();
        return buildertype;
    }

    public BuilderType L1(MessageType messagetype) {
        M1(messagetype);
        return this;
    }

    public BuilderType M1(MessageType messagetype) {
        if (R0().equals(messagetype)) {
            return this;
        }
        W1();
        H1(this.Y, messagetype);
        return this;
    }

    public BuilderType N1(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
        W1();
        try {
            zzhan.a().b(this.Y.getClass()).i(this.Y, zzgxr.T(zzgxqVar), zzgycVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public BuilderType O1(byte[] bArr, int i, int i2) throws zzgzh {
        int i3 = zzgyc.e;
        int i4 = zzhan.d;
        P1(bArr, i, i2, zzgyc.d);
        return this;
    }

    public BuilderType P1(byte[] bArr, int i, int i2, zzgyc zzgycVar) throws zzgzh {
        W1();
        try {
            zzhan.a().b(this.Y.getClass()).f(this.Y, bArr, i, i + i2, new zzgwy(zzgycVar));
            return this;
        } catch (zzgzh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* renamed from: Q1 */
    public final MessageType V1() {
        MessageType o3 = o3();
        if (o3.D0()) {
            return o3;
        }
        throw zzgws.A1(o3);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    /* renamed from: R1 */
    public MessageType o3() {
        if (!this.Y.i2()) {
            return this.Y;
        }
        this.Y.A1();
        return this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    /* renamed from: S1 */
    public MessageType R0() {
        return this.X;
    }

    public /* bridge */ /* synthetic */ zzhac U1() {
        J1();
        return this;
    }

    public final void W1() {
        if (!this.Y.i2()) {
            X1();
        }
    }

    public void X1() {
        MessageType G1 = G1();
        H1(G1, this.Y);
        this.Y = G1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgws
    public /* bridge */ /* synthetic */ zzgws a1(zzgwt zzgwtVar) {
        L1((zzgys) zzgwtVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgws
    public /* bridge */ /* synthetic */ zzgws h1(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
        N1(zzgxqVar, zzgycVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgws
    public /* bridge */ /* synthetic */ zzgws k1(byte[] bArr, int i, int i2) throws zzgzh {
        O1(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgws
    public /* bridge */ /* synthetic */ zzgws l1(byte[] bArr, int i, int i2, zzgyc zzgycVar) throws zzgzh {
        P1(bArr, i, i2, zzgycVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgws
    public /* bridge */ /* synthetic */ zzhac t1(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException {
        N1(zzgxqVar, zzgycVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgws
    public /* bridge */ /* synthetic */ zzhac w1(byte[] bArr, int i, int i2) throws zzgzh {
        O1(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgws
    public /* bridge */ /* synthetic */ zzhac z1(byte[] bArr, int i, int i2, zzgyc zzgycVar) throws zzgzh {
        P1(bArr, i, i2, zzgycVar);
        return this;
    }
}
