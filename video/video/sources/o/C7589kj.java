package o;

import java.util.concurrent.Executor;
import o.C7033iP1;

/* renamed from: o.kj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7589kj extends C7033iP1.k {
    public final AbstractC5209ax1 b1;
    public final Executor c1;
    public final InterfaceC10929yL<CG2> d1;
    public final boolean e1;
    public final boolean f1;
    public final long g1;

    public C7589kj(AbstractC5209ax1 abstractC5209ax1, Executor executor, InterfaceC10929yL<CG2> interfaceC10929yL, boolean z, boolean z2, long j) {
        if (abstractC5209ax1 != null) {
            this.b1 = abstractC5209ax1;
            this.c1 = executor;
            this.d1 = interfaceC10929yL;
            this.e1 = z;
            this.f1 = z2;
            this.g1 = j;
            return;
        }
        throw new NullPointerException("Null getOutputOptions");
    }

    public boolean equals(Object obj) {
        Executor executor;
        InterfaceC10929yL<CG2> interfaceC10929yL;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7033iP1.k) {
            C7033iP1.k kVar = (C7033iP1.k) obj;
            if (this.b1.equals(kVar.q()) && ((executor = this.c1) != null ? executor.equals(kVar.o()) : kVar.o() == null) && ((interfaceC10929yL = this.d1) != null ? interfaceC10929yL.equals(kVar.p()) : kVar.p() == null) && this.e1 == kVar.s() && this.f1 == kVar.v() && this.g1 == kVar.r()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = (this.b1.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.c1;
        int i2 = 0;
        if (executor == null) {
            hashCode = 0;
        } else {
            hashCode = executor.hashCode();
        }
        int i3 = (hashCode2 ^ hashCode) * 1000003;
        InterfaceC10929yL<CG2> interfaceC10929yL = this.d1;
        if (interfaceC10929yL != null) {
            i2 = interfaceC10929yL.hashCode();
        }
        int i4 = (i3 ^ i2) * 1000003;
        int i5 = 1237;
        if (this.e1) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i6 = (i4 ^ i) * 1000003;
        if (this.f1) {
            i5 = 1231;
        }
        long j = this.g1;
        return ((i6 ^ i5) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // o.C7033iP1.k
    public Executor o() {
        return this.c1;
    }

    @Override // o.C7033iP1.k
    public InterfaceC10929yL<CG2> p() {
        return this.d1;
    }

    @Override // o.C7033iP1.k
    public AbstractC5209ax1 q() {
        return this.b1;
    }

    @Override // o.C7033iP1.k
    public long r() {
        return this.g1;
    }

    @Override // o.C7033iP1.k
    public boolean s() {
        return this.e1;
    }

    public String toString() {
        return "RecordingRecord{getOutputOptions=" + this.b1 + ", getCallbackExecutor=" + this.c1 + ", getEventListener=" + this.d1 + ", hasAudioEnabled=" + this.e1 + ", isPersistent=" + this.f1 + ", getRecordingId=" + this.g1 + "}";
    }

    @Override // o.C7033iP1.k
    public boolean v() {
        return this.f1;
    }
}
