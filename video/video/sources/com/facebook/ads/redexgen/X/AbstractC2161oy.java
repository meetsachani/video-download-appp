package com.facebook.ads.redexgen.X;

import com.facebook.ads.redexgen.X.AbstractC2162oz;
import com.facebook.ads.redexgen.X.AnonymousClass61;
import com.facebook.ads.redexgen.X.C2163p0;
import java.util.ArrayDeque;
import java.util.Arrays;
import o.C10323vs;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.oy */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2161oy<I extends C2163p0, O extends AbstractC2162oz, E extends AnonymousClass61> implements AnonymousClass60<I, O, E> {
    public static byte[] A0D;
    public static String[] A0E = {"cgd1TDaxcVMzff1lRtR2y3rhLtmh1J5v", "3mVGt02Eg", "GhemOJNhIn1LMAkty7qqi4u9sWB6uqsq", "Qo0Xi3kRKf", "h5mwzI1V10xDDagqRPLzWxrZN9rQy7u9", "7mnuUFNh1uUIhw2tv7exehIC7mU2Hitk", "5ikXrDS3I2SzCX52iEXUFKqtVJtvkjlK", "jW6s0CcND"};
    public int A00;
    public int A01;
    public int A02;
    public E A03;
    public I A04;
    public boolean A05;
    public boolean A06;
    public final Thread A08;
    public final I[] A0B;
    public final O[] A0C;
    public final Object A07 = new Object();
    public final ArrayDeque<I> A09 = new ArrayDeque<>();
    public final ArrayDeque<O> A0A = new ArrayDeque<>();

    public static String A0O(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 73);
        }
        return new String(copyOfRange);
    }

    public static void A0S() {
        A0D = new byte[]{-32, 19, 10, -21, 7, -4, C8077mf.x, 0, 13, -43, -18, 4, 8, C8077mf.m, 7, 0, -33, 0, -2, 10, -1, 0, 13};
    }

    public abstract E A0Y(I i, O o2, boolean z);

    public abstract E A0Z(Throwable th);

    public abstract I A0a();

    public abstract O A0c();

    static {
        A0S();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oy != com.facebook.ads.androidx.media3.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.p0, O extends com.facebook.ads.redexgen.X.oz, E extends com.facebook.ads.redexgen.X.61> */
    /* JADX WARN: Incorrect condition in loop: B:18:0x0020 */
    /* JADX WARN: Incorrect condition in loop: B:22:0x0035 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC2161oy(I[] inputBuffers, O[] outputBuffers) {
        this.A0B = inputBuffers;
        this.A00 = inputBuffers.length;
        for (int i = 0; i < i; i++) {
            this.A0B[i] = A0a();
        }
        this.A0C = outputBuffers;
        this.A01 = outputBuffers.length;
        for (int i2 = 0; i2 < i; i2++) {
            this.A0C[i2] = A0c();
        }
        this.A08 = new Thread(A0O(0, 23, 82)) { // from class: com.facebook.ads.redexgen.X.65
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                if (WU.A02(this)) {
                    return;
                }
                try {
                    AbstractC2161oy.A0V(AbstractC2161oy.this);
                } catch (Throwable th) {
                    WU.A00(th, this);
                }
            }
        };
        this.A08.start();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oy != com.facebook.ads.androidx.media3.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.p0, O extends com.facebook.ads.redexgen.X.oz, E extends com.facebook.ads.redexgen.X.61> */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass60
    /* renamed from: A0N */
    public final I A5r() throws AnonymousClass61 {
        I i;
        I i2;
        synchronized (this.A07) {
            A0Q();
            AbstractC04543y.A08(this.A04 == null);
            if (this.A00 == 0) {
                i = null;
            } else {
                I[] iArr = this.A0B;
                int i3 = this.A00 - 1;
                this.A00 = i3;
                i = iArr[i3];
            }
            this.A04 = i;
            i2 = this.A04;
        }
        return i2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oy != com.facebook.ads.androidx.media3.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.p0, O extends com.facebook.ads.redexgen.X.oz, E extends com.facebook.ads.redexgen.X.61> */
    private void A0P() {
        if (A0W()) {
            this.A07.notify();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oy != com.facebook.ads.androidx.media3.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.p0, O extends com.facebook.ads.redexgen.X.oz, E extends com.facebook.ads.redexgen.X.61> */
    private void A0Q() throws AnonymousClass61 {
        E exception = this.A03;
        if (exception == null) {
            return;
        }
        throw exception;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oy != com.facebook.ads.androidx.media3.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.p0, O extends com.facebook.ads.redexgen.X.oz, E extends com.facebook.ads.redexgen.X.61> */
    public void A0R() {
        while (A0X()) {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oy != com.facebook.ads.androidx.media3.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.p0, O extends com.facebook.ads.redexgen.X.oz, E extends com.facebook.ads.redexgen.X.61> */
    private void A0T(I inputBuffer) {
        inputBuffer.A0A();
        I[] iArr = this.A0B;
        int i = this.A00;
        this.A00 = i + 1;
        iArr[i] = inputBuffer;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oy != com.facebook.ads.androidx.media3.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.p0, O extends com.facebook.ads.redexgen.X.oz, E extends com.facebook.ads.redexgen.X.61> */
    private void A0U(O outputBuffer) {
        outputBuffer.A0A();
        O[] oArr = this.A0C;
        int i = this.A01;
        this.A01 = i + 1;
        oArr[i] = outputBuffer;
    }

    public static /* synthetic */ void A0V(AbstractC2161oy abstractC2161oy) {
        abstractC2161oy.A0R();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oy != com.facebook.ads.androidx.media3.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.p0, O extends com.facebook.ads.redexgen.X.oz, E extends com.facebook.ads.redexgen.X.61> */
    private boolean A0W() {
        if (!this.A09.isEmpty()) {
            int i = this.A01;
            String[] strArr = A0E;
            if (strArr[6].charAt(21) == strArr[4].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[5] = "9DwPxvkyUmdJywitv52WFgQf7iOLAqys";
            strArr2[2] = "WYGXgkStQ9kUI1rtTWhvxjquSY9kHuMe";
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oy != com.facebook.ads.androidx.media3.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.p0, O extends com.facebook.ads.redexgen.X.oz, E extends com.facebook.ads.redexgen.X.61> */
    private boolean A0X() throws InterruptedException {
        E exception;
        synchronized (this.A07) {
            while (!this.A06 && !A0W()) {
                this.A07.wait();
            }
            if (this.A06) {
                return false;
            }
            I removeFirst = this.A09.removeFirst();
            O[] oArr = this.A0C;
            int i = this.A01 - 1;
            this.A01 = i;
            O o2 = oArr[i];
            boolean z = this.A05;
            this.A05 = false;
            if (removeFirst.A05()) {
                o2.A00(4);
            } else {
                if (removeFirst.A04()) {
                    o2.A00(Integer.MIN_VALUE);
                }
                if (removeFirst.A06()) {
                    o2.A00(C10323vs.Q0);
                }
                try {
                    exception = A0Y(removeFirst, o2, z);
                } catch (OutOfMemoryError e) {
                    exception = A0Z(e);
                } catch (RuntimeException e2) {
                    exception = A0Z(e2);
                }
                if (exception != null) {
                    synchronized (this.A07) {
                        this.A03 = exception;
                    }
                    return false;
                }
            }
            synchronized (this.A07) {
                if (this.A05) {
                    o2.A0B();
                } else if (o2.A04()) {
                    this.A02++;
                    o2.A0B();
                } else {
                    o2.A00 = this.A02;
                    this.A02 = 0;
                    this.A0A.addLast(o2);
                }
                A0T(removeFirst);
            }
            return true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oy != com.facebook.ads.androidx.media3.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.p0, O extends com.facebook.ads.redexgen.X.oz, E extends com.facebook.ads.redexgen.X.61> */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass60
    /* renamed from: A0b */
    public final O A5t() throws AnonymousClass61 {
        synchronized (this.A07) {
            A0Q();
            if (this.A0A.isEmpty()) {
                return null;
            }
            return this.A0A.removeFirst();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oy != com.facebook.ads.androidx.media3.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.p0, O extends com.facebook.ads.redexgen.X.oz, E extends com.facebook.ads.redexgen.X.61> */
    public final void A0d(int i) {
        AbstractC04543y.A08(this.A00 == this.A0B.length);
        for (I i2 : this.A0B) {
            i2.A0C(i);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oy != com.facebook.ads.androidx.media3.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.p0, O extends com.facebook.ads.redexgen.X.oz, E extends com.facebook.ads.redexgen.X.61> */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass60
    /* renamed from: A0e */
    public final void AHJ(I inputBuffer) throws AnonymousClass61 {
        synchronized (this.A07) {
            A0Q();
            AbstractC04543y.A07(inputBuffer == this.A04);
            this.A09.addLast(inputBuffer);
            A0P();
            this.A04 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oy != com.facebook.ads.androidx.media3.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.p0, O extends com.facebook.ads.redexgen.X.oz, E extends com.facebook.ads.redexgen.X.61> */
    public void A0f(O outputBuffer) {
        synchronized (this.A07) {
            A0U(outputBuffer);
            A0P();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oy != com.facebook.ads.androidx.media3.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.p0, O extends com.facebook.ads.redexgen.X.oz, E extends com.facebook.ads.redexgen.X.61> */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass60
    public final void AHb() {
        synchronized (this.A07) {
            this.A06 = true;
            this.A07.notify();
        }
        try {
            this.A08.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oy != com.facebook.ads.androidx.media3.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.p0, O extends com.facebook.ads.redexgen.X.oz, E extends com.facebook.ads.redexgen.X.61> */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass60
    public final void flush() {
        synchronized (this.A07) {
            this.A05 = true;
            this.A02 = 0;
            if (this.A04 != null) {
                A0T(this.A04);
                this.A04 = null;
            }
            while (!this.A09.isEmpty()) {
                A0T(this.A09.removeFirst());
            }
            while (!this.A0A.isEmpty()) {
                this.A0A.removeFirst().A0B();
            }
        }
    }
}
