package com.facebook.ads.redexgen.X;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;

/* renamed from: com.facebook.ads.redexgen.X.Xk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1191Xk extends Thread implements Closeable {
    public boolean A00 = false;
    public final /* synthetic */ C1192Xl A01;

    public C1191Xk(C1192Xl c1192Xl) {
        this.A01 = c1192Xl;
        start();
    }

    public final synchronized void A00() {
        C1190Xj c1190Xj;
        c1190Xj = this.A01.A02;
        c1190Xj.A02();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C1190Xj c1190Xj;
        synchronized (this) {
            this.A00 = true;
            c1190Xj = this.A01.A02;
            c1190Xj.A02();
        }
        try {
            join();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:686)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:544)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:302)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:302)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:302)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r1 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
        r0 = r5.A01.A03;
        r0.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005b, code lost:
        monitor-enter(r5.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005c, code lost:
        r0 = r5.A01.A02;
        r0.A03();
        r5.A01.A00 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006b, code lost:
        throw r2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0055 -> B:39:0x0056). Please submit an issue!!! */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        /*
            r5 = this;
            boolean r0 = com.facebook.ads.redexgen.X.WU.A02(r5)
            if (r0 == 0) goto L7
            return
        L7:
            r3 = r5
        L8:
            r4 = 0
            com.facebook.ads.redexgen.X.Xl r0 = r3.A01     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L6f
            com.facebook.ads.redexgen.X.Xj r0 = com.facebook.ads.redexgen.X.C1192Xl.A00(r0)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L6f
            r0.A04()     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L6f
            com.facebook.ads.redexgen.X.Xl r2 = r3.A01     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L6f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L6f
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L55
            boolean r1 = r3.A00     // Catch: java.lang.Throwable -> L4f
            com.facebook.ads.redexgen.X.Xl r0 = r3.A01     // Catch: java.lang.Throwable -> L4f
            com.facebook.ads.redexgen.X.Xj r0 = com.facebook.ads.redexgen.X.C1192Xl.A00(r0)     // Catch: java.lang.Throwable -> L4f
            boolean r0 = r0.A05()     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L27
            goto L35
        L27:
            if (r0 == 0) goto L8
            goto L2c
        L2a:
            r0 = move-exception
            goto L56
        L2c:
            com.facebook.ads.redexgen.X.Xl r0 = r3.A01     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L6f
            java.lang.Runnable r0 = com.facebook.ads.redexgen.X.C1192Xl.A02(r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L6f
            r0.run()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L6f
        L35:
            com.facebook.ads.redexgen.X.Xl r1 = r3.A01     // Catch: java.lang.Throwable -> L88
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L88
            com.facebook.ads.redexgen.X.Xl r0 = r3.A01     // Catch: java.lang.Throwable -> L48
            com.facebook.ads.redexgen.X.Xj r0 = com.facebook.ads.redexgen.X.C1192Xl.A00(r0)     // Catch: java.lang.Throwable -> L48
            r0.A03()     // Catch: java.lang.Throwable -> L48
            com.facebook.ads.redexgen.X.Xl r0 = r3.A01     // Catch: java.lang.Throwable -> L48
            com.facebook.ads.redexgen.X.C1192Xl.A01(r0, r4)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L48
            goto L81
        L48:
            r0 = move-exception
        L49:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4b
            goto L87
        L4b:
            r0 = move-exception
            goto L49
        L4d:
            r2 = move-exception
            goto L59
        L4f:
            r0 = move-exception
        L50:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L52
            goto L54
        L52:
            r0 = move-exception
            goto L50
        L54:
            throw r0     // Catch: java.lang.Throwable -> L55
        L55:
            r0 = move-exception
        L56:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r0     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L6f
        L58:
            r2 = move-exception
        L59:
            com.facebook.ads.redexgen.X.Xl r1 = r3.A01     // Catch: java.lang.Throwable -> L88
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L88
            com.facebook.ads.redexgen.X.Xl r0 = r3.A01     // Catch: java.lang.Throwable -> L6c
            com.facebook.ads.redexgen.X.Xj r0 = com.facebook.ads.redexgen.X.C1192Xl.A00(r0)     // Catch: java.lang.Throwable -> L6c
            r0.A03()     // Catch: java.lang.Throwable -> L6c
            com.facebook.ads.redexgen.X.Xl r0 = r3.A01     // Catch: java.lang.Throwable -> L6c
            com.facebook.ads.redexgen.X.C1192Xl.A01(r0, r4)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
            throw r2     // Catch: java.lang.Throwable -> L88
        L6c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
            throw r0     // Catch: java.lang.Throwable -> L88
        L6f:
            com.facebook.ads.redexgen.X.Xl r1 = r3.A01     // Catch: java.lang.Throwable -> L88
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L88
            com.facebook.ads.redexgen.X.Xl r0 = r3.A01     // Catch: java.lang.Throwable -> L82
            com.facebook.ads.redexgen.X.Xj r0 = com.facebook.ads.redexgen.X.C1192Xl.A00(r0)     // Catch: java.lang.Throwable -> L82
            r0.A03()     // Catch: java.lang.Throwable -> L82
            com.facebook.ads.redexgen.X.Xl r0 = r3.A01     // Catch: java.lang.Throwable -> L82
            com.facebook.ads.redexgen.X.C1192Xl.A01(r0, r4)     // Catch: java.lang.Throwable -> L82
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L82
        L81:
            return
        L82:
            r0 = move-exception
        L83:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L85
            goto L87
        L85:
            r0 = move-exception
            goto L83
        L87:
            throw r0     // Catch: java.lang.Throwable -> L88
        L88:
            r0 = move-exception
            com.facebook.ads.redexgen.X.WU.A00(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1191Xk.run():void");
    }
}
