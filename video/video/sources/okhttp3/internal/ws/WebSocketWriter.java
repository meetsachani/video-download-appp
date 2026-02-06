package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import o.C5422bq;
import o.C6562gT0;
import o.C8859ps;
import o.CK1;
import o.InterfaceC2579Bq;
import o.InterfaceC8303na2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nWebSocketWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketWriter.kt\nokhttp3/internal/ws/WebSocketWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"})
/* loaded from: classes4.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    @Nullable
    private final C5422bq.c maskCursor;
    @Nullable
    private final byte[] maskKey;
    @NotNull
    private final C5422bq messageBuffer;
    @Nullable
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    @NotNull
    private final Random random;
    @NotNull
    private final InterfaceC2579Bq sink;
    @NotNull
    private final C5422bq sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, @NotNull InterfaceC2579Bq interfaceC2579Bq, @NotNull Random random, boolean z2, boolean z3, long j) {
        byte[] bArr;
        C6562gT0.p(interfaceC2579Bq, "sink");
        C6562gT0.p(random, "random");
        this.isClient = z;
        this.sink = interfaceC2579Bq;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.messageBuffer = new C5422bq();
        this.sinkBuffer = interfaceC2579Bq.B();
        if (z) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.maskKey = bArr;
        this.maskCursor = z ? new C5422bq.c() : null;
    }

    private final void writeControlFrame(int i, C8859ps c8859ps) throws IOException {
        if (!this.writerClosed) {
            int g0 = c8859ps.g0();
            if (g0 <= 125) {
                this.sinkBuffer.writeByte(i | 128);
                if (this.isClient) {
                    this.sinkBuffer.writeByte(g0 | 128);
                    Random random = this.random;
                    byte[] bArr = this.maskKey;
                    C6562gT0.m(bArr);
                    random.nextBytes(bArr);
                    this.sinkBuffer.write(this.maskKey);
                    if (g0 > 0) {
                        long size = this.sinkBuffer.size();
                        this.sinkBuffer.K4(c8859ps);
                        C5422bq c5422bq = this.sinkBuffer;
                        C5422bq.c cVar = this.maskCursor;
                        C6562gT0.m(cVar);
                        c5422bq.G(cVar);
                        this.maskCursor.i(size);
                        WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.writeByte(g0);
                    this.sinkBuffer.K4(c8859ps);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    @NotNull
    public final Random getRandom() {
        return this.random;
    }

    @NotNull
    public final InterfaceC2579Bq getSink() {
        return this.sink;
    }

    public final void writeClose(int i, @Nullable C8859ps c8859ps) throws IOException {
        C8859ps c8859ps2 = C8859ps.Z0;
        if (i != 0 || c8859ps != null) {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            C5422bq c5422bq = new C5422bq();
            c5422bq.writeShort(i);
            if (c8859ps != null) {
                c5422bq.K4(c8859ps);
            }
            c8859ps2 = c5422bq.G4();
        }
        try {
            writeControlFrame(8, c8859ps2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i, @NotNull C8859ps c8859ps) throws IOException {
        int i2;
        C6562gT0.p(c8859ps, "data");
        if (!this.writerClosed) {
            this.messageBuffer.K4(c8859ps);
            int i3 = i | 128;
            if (this.perMessageDeflate && c8859ps.g0() >= this.minimumDeflateSize) {
                MessageDeflater messageDeflater = this.messageDeflater;
                if (messageDeflater == null) {
                    messageDeflater = new MessageDeflater(this.noContextTakeover);
                    this.messageDeflater = messageDeflater;
                }
                messageDeflater.deflate(this.messageBuffer);
                i3 = i | CK1.x;
            }
            long size = this.messageBuffer.size();
            this.sinkBuffer.writeByte(i3);
            if (this.isClient) {
                i2 = 128;
            } else {
                i2 = 0;
            }
            if (size <= 125) {
                this.sinkBuffer.writeByte(i2 | ((int) size));
            } else if (size <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                this.sinkBuffer.writeByte(i2 | 126);
                this.sinkBuffer.writeShort((int) size);
            } else {
                this.sinkBuffer.writeByte(i2 | 127);
                this.sinkBuffer.writeLong(size);
            }
            if (this.isClient) {
                Random random = this.random;
                byte[] bArr = this.maskKey;
                C6562gT0.m(bArr);
                random.nextBytes(bArr);
                this.sinkBuffer.write(this.maskKey);
                if (size > 0) {
                    C5422bq c5422bq = this.messageBuffer;
                    C5422bq.c cVar = this.maskCursor;
                    C6562gT0.m(cVar);
                    c5422bq.G(cVar);
                    this.maskCursor.i(0L);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            this.sinkBuffer.write(this.messageBuffer, size);
            this.sink.N0();
            return;
        }
        throw new IOException("closed");
    }

    public final void writePing(@NotNull C8859ps c8859ps) throws IOException {
        C6562gT0.p(c8859ps, "payload");
        writeControlFrame(9, c8859ps);
    }

    public final void writePong(@NotNull C8859ps c8859ps) throws IOException {
        C6562gT0.p(c8859ps, "payload");
        writeControlFrame(10, c8859ps);
    }
}
