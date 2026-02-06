package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import o.C5422bq;
import o.C6562gT0;
import o.C7458kA2;
import o.C8120mp2;
import o.C8859ps;
import o.C9516sY;
import o.FN1;
import o.InterfaceC7058iW0;
import o.InterfaceC7072ia2;
import o.InterfaceC8303na2;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class Relay {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    @InterfaceC7058iW0
    @NotNull
    public static final C8859ps PREFIX_CLEAN;
    @InterfaceC7058iW0
    @NotNull
    public static final C8859ps PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    @NotNull
    private final C5422bq buffer;
    private final long bufferMaxSize;
    private boolean complete;
    @Nullable
    private RandomAccessFile file;
    @NotNull
    private final C8859ps metadata;
    private int sourceCount;
    @Nullable
    private InterfaceC7072ia2 upstream;
    @NotNull
    private final C5422bq upstreamBuffer;
    private long upstreamPos;
    @Nullable
    private Thread upstreamReader;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final Relay edit(@NotNull File file, @NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull C8859ps c8859ps, long j) throws IOException {
            C6562gT0.p(file, "file");
            C6562gT0.p(interfaceC7072ia2, "upstream");
            C6562gT0.p(c8859ps, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, FN1.c1);
            Relay relay = new Relay(randomAccessFile, interfaceC7072ia2, 0L, c8859ps, j, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        @NotNull
        public final Relay read(@NotNull File file) throws IOException {
            C6562gT0.p(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, FN1.c1);
            FileChannel channel = randomAccessFile.getChannel();
            C6562gT0.o(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            C5422bq c5422bq = new C5422bq();
            fileOperator.read(0L, c5422bq, 32L);
            C8859ps c8859ps = Relay.PREFIX_CLEAN;
            if (C6562gT0.g(c5422bq.n3(c8859ps.g0()), c8859ps)) {
                long readLong = c5422bq.readLong();
                long readLong2 = c5422bq.readLong();
                C5422bq c5422bq2 = new C5422bq();
                fileOperator.read(32 + readLong, c5422bq2, readLong2);
                return new Relay(randomAccessFile, null, readLong, c5422bq2.G4(), 0L, null);
            }
            throw new IOException("unreadable cache file");
        }

        private Companion() {
        }
    }

    @InterfaceC8303na2({"SMAP\nRelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,356:1\n563#2:357\n*S KotlinDebug\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n*L\n267#1:357\n*E\n"})
    /* loaded from: classes4.dex */
    public final class RelaySource implements InterfaceC7072ia2 {
        @Nullable
        private FileOperator fileOperator;
        private long sourcePos;
        @NotNull
        private final C8120mp2 timeout = new C8120mp2();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            C6562gT0.m(file);
            FileChannel channel = file.getChannel();
            C6562gT0.o(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator != null) {
                RandomAccessFile randomAccessFile = null;
                this.fileOperator = null;
                Relay relay = Relay.this;
                synchronized (relay) {
                    try {
                        relay.setSourceCount(relay.getSourceCount() - 1);
                        if (relay.getSourceCount() == 0) {
                            RandomAccessFile file = relay.getFile();
                            relay.setFile(null);
                            randomAccessFile = file;
                        }
                        C7458kA2 c7458kA2 = C7458kA2.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (randomAccessFile != null) {
                    Util.closeQuietly(randomAccessFile);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
            if (r0 != true) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
            r6 = java.lang.Math.min(r21, r19.this$0.getUpstreamPos() - r19.sourcePos);
            r2 = r19.fileOperator;
            o.C6562gT0.m(r2);
            r2.read(r19.sourcePos + 32, r20, r6);
            r19.sourcePos += r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
            r0 = r19.this$0.getUpstream();
            o.C6562gT0.m(r0);
            r11 = r0.read(r19.this$0.getUpstreamBuffer(), r19.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
            if (r11 != (-1)) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
            r0 = r19.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
            r2.setUpstreamReader(null);
            o.C6562gT0.n(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
            r0 = o.C7458kA2.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
            r6 = java.lang.Math.min(r11, r21);
            r19.this$0.getUpstreamBuffer().p(r20, 0, r6);
            r19.sourcePos += r6;
            r13 = r19.fileOperator;
            o.C6562gT0.m(r13);
            r13.write(r19.this$0.getUpstreamPos() + 32, r19.this$0.getUpstreamBuffer().clone(), r11);
            r4 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
            monitor-enter(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ec, code lost:
            r4.getBuffer().write(r4.getUpstreamBuffer(), r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
            if (r4.getBuffer().size() <= r4.getBufferMaxSize()) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0107, code lost:
            r4.getBuffer().skip(r4.getBuffer().size() - r4.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x011e, code lost:
            r4.setUpstreamPos(r4.getUpstreamPos() + r11);
            r0 = o.C7458kA2.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0128, code lost:
            monitor-exit(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0129, code lost:
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x012b, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x012c, code lost:
            r2.setUpstreamReader(null);
            o.C6562gT0.n(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0137, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0138, code lost:
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x013e, code lost:
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0140, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0141, code lost:
            r2.setUpstreamReader(null);
            o.C6562gT0.n(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
            r3 = o.C7458kA2.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x014f, code lost:
            throw r0;
         */
        @Override // o.InterfaceC7072ia2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long read(@NotNull C5422bq c5422bq, long j) throws IOException {
            boolean z;
            C6562gT0.p(c5422bq, "sink");
            if (this.fileOperator != null) {
                Relay relay = Relay.this;
                synchronized (relay) {
                    while (true) {
                        try {
                            if (this.sourcePos == relay.getUpstreamPos()) {
                                if (relay.getComplete()) {
                                    return -1L;
                                }
                                if (relay.getUpstreamReader() != null) {
                                    this.timeout.waitUntilNotified(relay);
                                } else {
                                    relay.setUpstreamReader(Thread.currentThread());
                                    z = true;
                                    break;
                                }
                            } else {
                                long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().size();
                                if (this.sourcePos < upstreamPos) {
                                    z = true;
                                } else {
                                    long min = Math.min(j, relay.getUpstreamPos() - this.sourcePos);
                                    relay.getBuffer().p(c5422bq, this.sourcePos - upstreamPos, min);
                                    this.sourcePos += min;
                                    return min;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }

        @Override // o.InterfaceC7072ia2
        @NotNull
        public C8120mp2 timeout() {
            return this.timeout;
        }
    }

    static {
        C8859ps.a aVar = C8859ps.Y0;
        PREFIX_CLEAN = aVar.l("OkHttp cache v1\n");
        PREFIX_DIRTY = aVar.l("OkHttp DIRTY :(\n");
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, InterfaceC7072ia2 interfaceC7072ia2, long j, C8859ps c8859ps, long j2, C9516sY c9516sY) {
        this(randomAccessFile, interfaceC7072ia2, j, c8859ps, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(C8859ps c8859ps, long j, long j2) throws IOException {
        C5422bq c5422bq = new C5422bq();
        c5422bq.K4(c8859ps);
        c5422bq.writeLong(j);
        c5422bq.writeLong(j2);
        if (c5422bq.size() == 32) {
            RandomAccessFile randomAccessFile = this.file;
            C6562gT0.m(randomAccessFile);
            FileChannel channel = randomAccessFile.getChannel();
            C6562gT0.o(channel, "file!!.channel");
            new FileOperator(channel).write(0L, c5422bq, 32L);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private final void writeMetadata(long j) throws IOException {
        C5422bq c5422bq = new C5422bq();
        c5422bq.K4(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        C6562gT0.m(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        C6562gT0.o(channel, "file!!.channel");
        new FileOperator(channel).write(32 + j, c5422bq, this.metadata.g0());
    }

    public final void commit(long j) throws IOException {
        writeMetadata(j);
        RandomAccessFile randomAccessFile = this.file;
        C6562gT0.m(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, this.metadata.g0());
        RandomAccessFile randomAccessFile2 = this.file;
        C6562gT0.m(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            C7458kA2 c7458kA2 = C7458kA2.a;
        }
        InterfaceC7072ia2 interfaceC7072ia2 = this.upstream;
        if (interfaceC7072ia2 != null) {
            Util.closeQuietly(interfaceC7072ia2);
        }
        this.upstream = null;
    }

    @NotNull
    public final C5422bq getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    @Nullable
    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    @Nullable
    public final InterfaceC7072ia2 getUpstream() {
        return this.upstream;
    }

    @NotNull
    public final C5422bq getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    @Nullable
    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        if (this.file == null) {
            return true;
        }
        return false;
    }

    @NotNull
    public final C8859ps metadata() {
        return this.metadata;
    }

    @Nullable
    public final InterfaceC7072ia2 newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(@Nullable RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final void setUpstream(@Nullable InterfaceC7072ia2 interfaceC7072ia2) {
        this.upstream = interfaceC7072ia2;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(@Nullable Thread thread) {
        this.upstreamReader = thread;
    }

    private Relay(RandomAccessFile randomAccessFile, InterfaceC7072ia2 interfaceC7072ia2, long j, C8859ps c8859ps, long j2) {
        this.file = randomAccessFile;
        this.upstream = interfaceC7072ia2;
        this.upstreamPos = j;
        this.metadata = c8859ps;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new C5422bq();
        this.complete = this.upstream == null;
        this.buffer = new C5422bq();
    }
}
