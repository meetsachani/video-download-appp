package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import o.C5422bq;
import o.C6562gT0;
import o.C8859ps;
import o.InterfaceC2677Cq;
import o.InterfaceC8303na2;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nWebSocketReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketReader.kt\nokhttp3/internal/ws/WebSocketReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
/* loaded from: classes4.dex */
public final class WebSocketReader implements Closeable {
    private boolean closed;
    @NotNull
    private final C5422bq controlFrameBuffer;
    @NotNull
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    @Nullable
    private final C5422bq.c maskCursor;
    @Nullable
    private final byte[] maskKey;
    @NotNull
    private final C5422bq messageFrameBuffer;
    @Nullable
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    @NotNull
    private final InterfaceC2677Cq source;

    /* loaded from: classes4.dex */
    public interface FrameCallback {
        void onReadClose(int i, @NotNull String str);

        void onReadMessage(@NotNull String str) throws IOException;

        void onReadMessage(@NotNull C8859ps c8859ps) throws IOException;

        void onReadPing(@NotNull C8859ps c8859ps);

        void onReadPong(@NotNull C8859ps c8859ps);
    }

    public WebSocketReader(boolean z, @NotNull InterfaceC2677Cq interfaceC2677Cq, @NotNull FrameCallback frameCallback, boolean z2, boolean z3) {
        byte[] bArr;
        C6562gT0.p(interfaceC2677Cq, "source");
        C6562gT0.p(frameCallback, "frameCallback");
        this.isClient = z;
        this.source = interfaceC2677Cq;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.controlFrameBuffer = new C5422bq();
        this.messageFrameBuffer = new C5422bq();
        if (z) {
            bArr = null;
        } else {
            bArr = new byte[4];
        }
        this.maskKey = bArr;
        this.maskCursor = z ? null : new C5422bq.c();
    }

    private final void readControlFrame() throws IOException {
        short s;
        String str;
        long j = this.frameLength;
        if (j > 0) {
            this.source.b1(this.controlFrameBuffer, j);
            if (!this.isClient) {
                C5422bq c5422bq = this.controlFrameBuffer;
                C5422bq.c cVar = this.maskCursor;
                C6562gT0.m(cVar);
                c5422bq.G(cVar);
                this.maskCursor.i(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                C5422bq.c cVar2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                C6562gT0.m(bArr);
                webSocketProtocol.toggleMask(cVar2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                long size = this.controlFrameBuffer.size();
                if (size != 1) {
                    if (size != 0) {
                        s = this.controlFrameBuffer.readShort();
                        str = this.controlFrameBuffer.Y4();
                        String closeCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        s = 1005;
                        str = "";
                    }
                    this.frameCallback.onReadClose(s, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.G4());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.G4());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Util.toHexString(this.opcode));
        }
    }

    private final void readHeader() throws IOException, ProtocolException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int and = Util.and(this.source.readByte(), 255);
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                int i = and & 15;
                this.opcode = i;
                boolean z5 = false;
                if ((and & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.isFinalFrame = z;
                if ((and & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.isControlFrame = z2;
                if (z2 && !z) {
                    throw new ProtocolException("Control frames must be final.");
                }
                if ((and & 64) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i != 1 && i != 2) {
                    if (z3) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                } else {
                    if (z3) {
                        if (this.perMessageDeflate) {
                            z4 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                    } else {
                        z4 = false;
                    }
                    this.readingCompressedMessage = z4;
                }
                if ((and & 32) == 0) {
                    if ((and & 16) == 0) {
                        int and2 = Util.and(this.source.readByte(), 255);
                        if ((and2 & 128) != 0) {
                            z5 = true;
                        }
                        if (z5 == this.isClient) {
                            if (this.isClient) {
                                str = "Server-sent frames must not be masked.";
                            } else {
                                str = "Client-sent frames must be masked.";
                            }
                            throw new ProtocolException(str);
                        }
                        long j = and2 & 127;
                        this.frameLength = j;
                        if (j == 126) {
                            this.frameLength = Util.and(this.source.readShort(), 65535);
                        } else if (j == 127) {
                            long readLong = this.source.readLong();
                            this.frameLength = readLong;
                            if (readLong < 0) {
                                throw new ProtocolException("Frame length 0x" + Util.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                            }
                        }
                        if (this.isControlFrame && this.frameLength > 125) {
                            throw new ProtocolException("Control frame must be less than 125B.");
                        }
                        if (z5) {
                            InterfaceC2677Cq interfaceC2677Cq = this.source;
                            byte[] bArr = this.maskKey;
                            C6562gT0.m(bArr);
                            interfaceC2677Cq.readFully(bArr);
                            return;
                        }
                        return;
                    }
                    throw new ProtocolException("Unexpected rsv3 flag");
                }
                throw new ProtocolException("Unexpected rsv2 flag");
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        }
        throw new IOException("closed");
    }

    private final void readMessage() throws IOException {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.b1(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    C5422bq c5422bq = this.messageFrameBuffer;
                    C5422bq.c cVar = this.maskCursor;
                    C6562gT0.m(cVar);
                    c5422bq.G(cVar);
                    this.maskCursor.i(this.messageFrameBuffer.size() - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    C5422bq.c cVar2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    C6562gT0.m(bArr);
                    webSocketProtocol.toggleMask(cVar2, bArr);
                    this.maskCursor.close();
                }
            }
            if (!this.isFinalFrame) {
                readUntilNonControlFrame();
                if (this.opcode != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + Util.toHexString(this.opcode));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    private final void readMessageFrame() throws IOException {
        int i = this.opcode;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Util.toHexString(i));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        if (i == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.Y4());
        } else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.G4());
        }
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    @NotNull
    public final InterfaceC2677Cq getSource() {
        return this.source;
    }

    public final void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
