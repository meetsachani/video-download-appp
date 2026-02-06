package okhttp3.internal.cache;

import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o.AbstractC3501Ky0;
import o.C10219vQ1;
import o.C10763xf2;
import o.C5033aE;
import o.C5722d40;
import o.C6562gT0;
import o.C6566gU0;
import o.C7458kA2;
import o.C9516sY;
import o.C9545sf2;
import o.C9604su1;
import o.InterfaceC2579Bq;
import o.InterfaceC2677Cq;
import o.InterfaceC7058iW0;
import o.InterfaceC7072ia2;
import o.InterfaceC8289nW0;
import o.InterfaceC8303na2;
import o.J82;
import o.SX0;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1065:1\n1#2:1066\n608#3,4:1067\n37#4,2:1071\n37#4,2:1073\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n*L\n215#1:1067,4\n672#1:1071,2\n721#1:1073,2\n*E\n"})
/* loaded from: classes4.dex */
public final class DiskLruCache implements Closeable, Flushable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    @NotNull
    private final TaskQueue cleanupQueue;
    @NotNull
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    @NotNull
    private final File directory;
    @NotNull
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    @NotNull
    private final File journalFile;
    @NotNull
    private final File journalFileBackup;
    @NotNull
    private final File journalFileTmp;
    @Nullable
    private InterfaceC2579Bq journalWriter;
    @NotNull
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @InterfaceC7058iW0
    @NotNull
    public static final String JOURNAL_FILE = C5722d40.j1;
    @InterfaceC7058iW0
    @NotNull
    public static final String JOURNAL_FILE_TEMP = C5722d40.k1;
    @InterfaceC7058iW0
    @NotNull
    public static final String JOURNAL_FILE_BACKUP = C5722d40.l1;
    @InterfaceC7058iW0
    @NotNull
    public static final String MAGIC = C5722d40.m1;
    @InterfaceC7058iW0
    @NotNull
    public static final String VERSION_1 = "1";
    @InterfaceC7058iW0
    public static final long ANY_SEQUENCE_NUMBER = -1;
    @InterfaceC7058iW0
    @NotNull
    public static final C10219vQ1 LEGAL_KEY_PATTERN = new C10219vQ1("[a-z0-9_-]{1,120}");
    @InterfaceC7058iW0
    @NotNull
    public static final String CLEAN = C5722d40.p1;
    @InterfaceC7058iW0
    @NotNull
    public static final String DIRTY = C5722d40.q1;
    @InterfaceC7058iW0
    @NotNull
    public static final String REMOVE = C5722d40.r1;
    @InterfaceC7058iW0
    @NotNull
    public static final String READ = C5722d40.s1;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    /* loaded from: classes4.dex */
    public final class Editor {
        private boolean done;
        @NotNull
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        @Nullable
        private final boolean[] written;

        public Editor(@NotNull DiskLruCache diskLruCache, Entry entry) {
            boolean[] zArr;
            C6562gT0.p(entry, DefaultsXmlParser.a);
            this.this$0 = diskLruCache;
            this.entry = entry;
            if (entry.getReadable$okhttp()) {
                zArr = null;
            } else {
                zArr = new boolean[diskLruCache.getValueCount$okhttp()];
            }
            this.written = zArr;
        }

        public final void abort() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (!this.done) {
                        if (C6562gT0.g(this.entry.getCurrentEditor$okhttp(), this)) {
                            diskLruCache.completeEdit$okhttp(this, false);
                        }
                        this.done = true;
                        C7458kA2 c7458kA2 = C7458kA2.a;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void commit() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (!this.done) {
                        if (C6562gT0.g(this.entry.getCurrentEditor$okhttp(), this)) {
                            diskLruCache.completeEdit$okhttp(this, true);
                        }
                        this.done = true;
                        C7458kA2 c7458kA2 = C7458kA2.a;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void detach$okhttp() {
            if (C6562gT0.g(this.entry.getCurrentEditor$okhttp(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        @NotNull
        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        @Nullable
        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        @NotNull
        public final J82 newSink(int i) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!this.done) {
                    if (!C6562gT0.g(this.entry.getCurrentEditor$okhttp(), this)) {
                        return C9604su1.c();
                    }
                    if (!this.entry.getReadable$okhttp()) {
                        boolean[] zArr = this.written;
                        C6562gT0.m(zArr);
                        zArr[i] = true;
                    }
                    try {
                        return new FaultHidingSink(diskLruCache.getFileSystem$okhttp().sink(this.entry.getDirtyFiles$okhttp().get(i)), new DiskLruCache$Editor$newSink$1$1(diskLruCache, this));
                    } catch (FileNotFoundException unused) {
                        return C9604su1.c();
                    }
                }
                throw new IllegalStateException("Check failed.");
            }
        }

        @Nullable
        public final InterfaceC7072ia2 newSource(int i) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!this.done) {
                    InterfaceC7072ia2 interfaceC7072ia2 = null;
                    if (!this.entry.getReadable$okhttp() || !C6562gT0.g(this.entry.getCurrentEditor$okhttp(), this) || this.entry.getZombie$okhttp()) {
                        return null;
                    }
                    try {
                        interfaceC7072ia2 = diskLruCache.getFileSystem$okhttp().source(this.entry.getCleanFiles$okhttp().get(i));
                    } catch (FileNotFoundException unused) {
                    }
                    return interfaceC7072ia2;
                }
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    @InterfaceC8303na2({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1065:1\n608#2,4:1066\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n*L\n1001#1:1066,4\n*E\n"})
    /* loaded from: classes4.dex */
    public final class Entry {
        @NotNull
        private final List<File> cleanFiles;
        @Nullable
        private Editor currentEditor;
        @NotNull
        private final List<File> dirtyFiles;
        @NotNull
        private final String key;
        @NotNull
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(@NotNull DiskLruCache diskLruCache, String str) {
            C6562gT0.p(str, "key");
            this.this$0 = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i = 0; i < valueCount$okhttp; i++) {
                sb.append(i);
                this.cleanFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        private final InterfaceC7072ia2 newSource(int i) {
            final InterfaceC7072ia2 source = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i));
            if (this.this$0.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            final DiskLruCache diskLruCache = this.this$0;
            return new AbstractC3501Ky0(source) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;

                @Override // o.AbstractC3501Ky0, o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    if (!this.closed) {
                        this.closed = true;
                        DiskLruCache diskLruCache2 = diskLruCache;
                        DiskLruCache.Entry entry = this;
                        synchronized (diskLruCache2) {
                            try {
                                entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                                if (entry.getLockingSourceCount$okhttp() == 0 && entry.getZombie$okhttp()) {
                                    diskLruCache2.removeEntry$okhttp(entry);
                                }
                                C7458kA2 c7458kA2 = C7458kA2.a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
            };
        }

        @NotNull
        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        @Nullable
        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        @NotNull
        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        @NotNull
        public final String getKey$okhttp() {
            return this.key;
        }

        @NotNull
        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(@Nullable Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(@NotNull List<String> list) throws IOException {
            C6562gT0.p(list, "strings");
            if (list.size() == this.this$0.getValueCount$okhttp()) {
                try {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        this.lengths[i] = Long.parseLong(list.get(i));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    invalidLengths(list);
                    throw new SX0();
                }
            }
            invalidLengths(list);
            throw new SX0();
        }

        public final void setLockingSourceCount$okhttp(int i) {
            this.lockingSourceCount = i;
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        public final void setSequenceNumber$okhttp(long j) {
            this.sequenceNumber = j;
        }

        public final void setZombie$okhttp(boolean z) {
            this.zombie = z;
        }

        @Nullable
        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
            } else if (!this.readable) {
                return null;
            } else {
                if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                    return null;
                }
                ArrayList<InterfaceC7072ia2> arrayList = new ArrayList();
                long[] jArr = (long[]) this.lengths.clone();
                try {
                    int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                    for (int i = 0; i < valueCount$okhttp; i++) {
                        arrayList.add(newSource(i));
                    }
                    return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    for (InterfaceC7072ia2 interfaceC7072ia2 : arrayList) {
                        Util.closeQuietly(interfaceC7072ia2);
                    }
                    try {
                        this.this$0.removeEntry$okhttp(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
        }

        public final void writeLengths$okhttp(@NotNull InterfaceC2579Bq interfaceC2579Bq) throws IOException {
            C6562gT0.p(interfaceC2579Bq, "writer");
            for (long j : this.lengths) {
                interfaceC2579Bq.writeByte(32).S2(j);
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class Snapshot implements Closeable {
        @NotNull
        private final String key;
        @NotNull
        private final long[] lengths;
        private final long sequenceNumber;
        @NotNull
        private final List<InterfaceC7072ia2> sources;
        final /* synthetic */ DiskLruCache this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(@NotNull DiskLruCache diskLruCache, String str, @NotNull long j, @NotNull List<? extends InterfaceC7072ia2> list, long[] jArr) {
            C6562gT0.p(str, "key");
            C6562gT0.p(list, "sources");
            C6562gT0.p(jArr, "lengths");
            this.this$0 = diskLruCache;
            this.key = str;
            this.sequenceNumber = j;
            this.sources = list;
            this.lengths = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InterfaceC7072ia2 interfaceC7072ia2 : this.sources) {
                Util.closeQuietly(interfaceC7072ia2);
            }
        }

        @Nullable
        public final Editor edit() throws IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        @NotNull
        public final InterfaceC7072ia2 getSource(int i) {
            return this.sources.get(i);
        }

        @NotNull
        public final String key() {
            return this.key;
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(@NotNull FileSystem fileSystem, @NotNull File file, int i, int i2, long j, @NotNull TaskRunner taskRunner) {
        C6562gT0.p(fileSystem, "fileSystem");
        C6562gT0.p(file, "directory");
        C6562gT0.p(taskRunner, "taskRunner");
        this.fileSystem = fileSystem;
        this.directory = file;
        this.appVersion = i;
        this.valueCount = i2;
        this.maxSize = j;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        final String str = Util.okHttpName + " Cache";
        this.cleanupTask = new Task(str) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean z;
                boolean journalRebuildRequired;
                DiskLruCache diskLruCache = DiskLruCache.this;
                synchronized (diskLruCache) {
                    z = diskLruCache.initialized;
                    if (!z || diskLruCache.getClosed$okhttp()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        diskLruCache.mostRecentTrimFailed = true;
                    }
                    try {
                        journalRebuildRequired = diskLruCache.journalRebuildRequired();
                        if (journalRebuildRequired) {
                            diskLruCache.rebuildJournal$okhttp();
                            diskLruCache.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.mostRecentRebuildFailed = true;
                        diskLruCache.journalWriter = C9604su1.d(C9604su1.c());
                    }
                    return -1L;
                }
            }
        };
        if (j > 0) {
            if (i2 > 0) {
                this.journalFile = new File(file, JOURNAL_FILE);
                this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
                this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private final synchronized void checkNotClosed() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        if (i >= 2000 && i >= this.lruEntries.size()) {
            return true;
        }
        return false;
    }

    private final InterfaceC2579Bq newJournalWriter() throws FileNotFoundException {
        return C9604su1.d(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            C6562gT0.o(next, "i.next()");
            Entry entry = next;
            int i = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    this.size += entry.getLengths$okhttp()[i];
                    i++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                int i3 = this.valueCount;
                while (i < i3) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private final void readJournal() throws IOException {
        InterfaceC2677Cq e = C9604su1.e(this.fileSystem.source(this.journalFile));
        try {
            String k2 = e.k2();
            String k22 = e.k2();
            String k23 = e.k2();
            String k24 = e.k2();
            String k25 = e.k2();
            if (C6562gT0.g(MAGIC, k2) && C6562gT0.g(VERSION_1, k22) && C6562gT0.g(String.valueOf(this.appVersion), k23) && C6562gT0.g(String.valueOf(this.valueCount), k24) && k25.length() <= 0) {
                int i = 0;
                while (true) {
                    try {
                        readJournalLine(e.k2());
                        i++;
                    } catch (EOFException unused) {
                        this.redundantOpCount = i - this.lruEntries.size();
                        if (!e.M3()) {
                            rebuildJournal$okhttp();
                        } else {
                            this.journalWriter = newJournalWriter();
                        }
                        C7458kA2 c7458kA2 = C7458kA2.a;
                        C5033aE.a(e, null);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + k2 + C6566gU0.h + k22 + C6566gU0.h + k24 + C6566gU0.h + k25 + ']');
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C5033aE.a(e, th);
                throw th2;
            }
        }
    }

    private final void readJournalLine(String str) throws IOException {
        String substring;
        int I3 = C10763xf2.I3(str, ' ', 0, false, 6, null);
        if (I3 != -1) {
            int i = I3 + 1;
            int I32 = C10763xf2.I3(str, ' ', i, false, 4, null);
            if (I32 == -1) {
                substring = str.substring(i);
                C6562gT0.o(substring, "this as java.lang.String).substring(startIndex)");
                String str2 = REMOVE;
                if (I3 == str2.length() && C9545sf2.J2(str, str2, false, 2, null)) {
                    this.lruEntries.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, I32);
                C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Entry entry = this.lruEntries.get(substring);
            if (entry == null) {
                entry = new Entry(this, substring);
                this.lruEntries.put(substring, entry);
            }
            if (I32 != -1) {
                String str3 = CLEAN;
                if (I3 == str3.length() && C9545sf2.J2(str, str3, false, 2, null)) {
                    String substring2 = str.substring(I32 + 1);
                    C6562gT0.o(substring2, "this as java.lang.String).substring(startIndex)");
                    List<String> n5 = C10763xf2.n5(substring2, new char[]{' '}, false, 0, 6, null);
                    entry.setReadable$okhttp(true);
                    entry.setCurrentEditor$okhttp(null);
                    entry.setLengths$okhttp(n5);
                    return;
                }
            }
            if (I32 == -1) {
                String str4 = DIRTY;
                if (I3 == str4.length() && C9545sf2.J2(str, str4, false, 2, null)) {
                    entry.setCurrentEditor$okhttp(new Editor(this, entry));
                    return;
                }
            }
            if (I32 == -1) {
                String str5 = READ;
                if (I3 == str5.length() && C9545sf2.J2(str, str5, false, 2, null)) {
                    return;
                }
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private final boolean removeOldestEntry() {
        for (Entry entry : this.lruEntries.values()) {
            if (!entry.getZombie$okhttp()) {
                C6562gT0.o(entry, "toEvict");
                removeEntry$okhttp(entry);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.m(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        Entry[] entryArr;
        Editor currentEditor$okhttp;
        try {
            if (this.initialized && !this.closed) {
                Collection<Entry> values = this.lruEntries.values();
                C6562gT0.o(values, "lruEntries.values");
                for (Entry entry : (Entry[]) values.toArray(new Entry[0])) {
                    if (entry.getCurrentEditor$okhttp() != null && (currentEditor$okhttp = entry.getCurrentEditor$okhttp()) != null) {
                        currentEditor$okhttp.detach$okhttp();
                    }
                }
                trimToSize();
                InterfaceC2579Bq interfaceC2579Bq = this.journalWriter;
                C6562gT0.m(interfaceC2579Bq);
                interfaceC2579Bq.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void completeEdit$okhttp(@NotNull Editor editor, boolean z) throws IOException {
        C6562gT0.p(editor, "editor");
        Entry entry$okhttp = editor.getEntry$okhttp();
        if (C6562gT0.g(entry$okhttp.getCurrentEditor$okhttp(), editor)) {
            if (z && !entry$okhttp.getReadable$okhttp()) {
                int i = this.valueCount;
                for (int i2 = 0; i2 < i; i2++) {
                    boolean[] written$okhttp = editor.getWritten$okhttp();
                    C6562gT0.m(written$okhttp);
                    if (written$okhttp[i2]) {
                        if (!this.fileSystem.exists(entry$okhttp.getDirtyFiles$okhttp().get(i2))) {
                            editor.abort();
                            return;
                        }
                    } else {
                        editor.abort();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                }
            }
            int i3 = this.valueCount;
            for (int i4 = 0; i4 < i3; i4++) {
                File file = entry$okhttp.getDirtyFiles$okhttp().get(i4);
                if (z && !entry$okhttp.getZombie$okhttp()) {
                    if (this.fileSystem.exists(file)) {
                        File file2 = entry$okhttp.getCleanFiles$okhttp().get(i4);
                        this.fileSystem.rename(file, file2);
                        long j = entry$okhttp.getLengths$okhttp()[i4];
                        long size = this.fileSystem.size(file2);
                        entry$okhttp.getLengths$okhttp()[i4] = size;
                        this.size = (this.size - j) + size;
                    }
                } else {
                    this.fileSystem.delete(file);
                }
            }
            entry$okhttp.setCurrentEditor$okhttp(null);
            if (entry$okhttp.getZombie$okhttp()) {
                removeEntry$okhttp(entry$okhttp);
                return;
            }
            this.redundantOpCount++;
            InterfaceC2579Bq interfaceC2579Bq = this.journalWriter;
            C6562gT0.m(interfaceC2579Bq);
            if (!entry$okhttp.getReadable$okhttp() && !z) {
                this.lruEntries.remove(entry$okhttp.getKey$okhttp());
                interfaceC2579Bq.K1(REMOVE).writeByte(32);
                interfaceC2579Bq.K1(entry$okhttp.getKey$okhttp());
                interfaceC2579Bq.writeByte(10);
                interfaceC2579Bq.flush();
                if (this.size <= this.maxSize || journalRebuildRequired()) {
                    TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                }
                return;
            }
            entry$okhttp.setReadable$okhttp(true);
            interfaceC2579Bq.K1(CLEAN).writeByte(32);
            interfaceC2579Bq.K1(entry$okhttp.getKey$okhttp());
            entry$okhttp.writeLengths$okhttp(interfaceC2579Bq);
            interfaceC2579Bq.writeByte(10);
            if (z) {
                long j2 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j2;
                entry$okhttp.setSequenceNumber$okhttp(j2);
            }
            interfaceC2579Bq.flush();
            if (this.size <= this.maxSize) {
            }
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    @InterfaceC8289nW0
    @Nullable
    public final Editor edit(@NotNull String str) throws IOException {
        C6562gT0.p(str, "key");
        return edit$default(this, str, 0L, 2, null);
    }

    public final synchronized void evictAll() throws IOException {
        Entry[] entryArr;
        try {
            initialize();
            Collection<Entry> values = this.lruEntries.values();
            C6562gT0.o(values, "lruEntries.values");
            for (Entry entry : (Entry[]) values.toArray(new Entry[0])) {
                C6562gT0.o(entry, DefaultsXmlParser.a);
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (!this.initialized) {
            return;
        }
        checkNotClosed();
        trimToSize();
        InterfaceC2579Bq interfaceC2579Bq = this.journalWriter;
        C6562gT0.m(interfaceC2579Bq);
        interfaceC2579Bq.flush();
    }

    @Nullable
    public final synchronized Snapshot get(@NotNull String str) throws IOException {
        C6562gT0.p(str, "key");
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return null;
        }
        Snapshot snapshot$okhttp = entry.snapshot$okhttp();
        if (snapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        InterfaceC2579Bq interfaceC2579Bq = this.journalWriter;
        C6562gT0.m(interfaceC2579Bq);
        interfaceC2579Bq.K1(READ).writeByte(32).K1(str).writeByte(10);
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return snapshot$okhttp;
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    @NotNull
    public final File getDirectory() {
        return this.directory;
    }

    @NotNull
    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    @NotNull
    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() throws IOException {
        try {
            if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e) {
                    Platform platform = Platform.Companion.get();
                    platform.log("DiskLruCache " + this.directory + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                    delete();
                    this.closed = false;
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void rebuildJournal$okhttp() throws IOException {
        try {
            InterfaceC2579Bq interfaceC2579Bq = this.journalWriter;
            if (interfaceC2579Bq != null) {
                interfaceC2579Bq.close();
            }
            InterfaceC2579Bq d = C9604su1.d(this.fileSystem.sink(this.journalFileTmp));
            d.K1(MAGIC).writeByte(10);
            d.K1(VERSION_1).writeByte(10);
            d.S2(this.appVersion).writeByte(10);
            d.S2(this.valueCount).writeByte(10);
            d.writeByte(10);
            for (Entry entry : this.lruEntries.values()) {
                if (entry.getCurrentEditor$okhttp() != null) {
                    d.K1(DIRTY).writeByte(32);
                    d.K1(entry.getKey$okhttp());
                    d.writeByte(10);
                } else {
                    d.K1(CLEAN).writeByte(32);
                    d.K1(entry.getKey$okhttp());
                    entry.writeLengths$okhttp(d);
                    d.writeByte(10);
                }
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            C5033aE.a(d, null);
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.rename(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.rename(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean remove(@NotNull String str) throws IOException {
        C6562gT0.p(str, "key");
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return false;
        }
        boolean removeEntry$okhttp = removeEntry$okhttp(entry);
        if (removeEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return removeEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(@NotNull Entry entry) throws IOException {
        InterfaceC2579Bq interfaceC2579Bq;
        C6562gT0.p(entry, DefaultsXmlParser.a);
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (interfaceC2579Bq = this.journalWriter) != null) {
                interfaceC2579Bq.K1(DIRTY);
                interfaceC2579Bq.writeByte(32);
                interfaceC2579Bq.K1(entry.getKey$okhttp());
                interfaceC2579Bq.writeByte(10);
                interfaceC2579Bq.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i2));
            this.size -= entry.getLengths$okhttp()[i2];
            entry.getLengths$okhttp()[i2] = 0;
        }
        this.redundantOpCount++;
        InterfaceC2579Bq interfaceC2579Bq2 = this.journalWriter;
        if (interfaceC2579Bq2 != null) {
            interfaceC2579Bq2.K1(REMOVE);
            interfaceC2579Bq2.writeByte(32);
            interfaceC2579Bq2.K1(entry.getKey$okhttp());
            interfaceC2579Bq2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z) {
        this.closed = z;
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final synchronized long size() throws IOException {
        initialize();
        return this.size;
    }

    @NotNull
    public final synchronized Iterator<Snapshot> snapshots() throws IOException {
        initialize();
        return new DiskLruCache$snapshots$1(this);
    }

    public final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    @InterfaceC8289nW0
    @Nullable
    public final synchronized Editor edit(@NotNull String str, long j) throws IOException {
        C6562gT0.p(str, "key");
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (j == ANY_SEQUENCE_NUMBER || (entry != null && entry.getSequenceNumber$okhttp() == j)) {
            if ((entry != null ? entry.getCurrentEditor$okhttp() : null) != null) {
                return null;
            }
            if (entry == null || entry.getLockingSourceCount$okhttp() == 0) {
                if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
                    InterfaceC2579Bq interfaceC2579Bq = this.journalWriter;
                    C6562gT0.m(interfaceC2579Bq);
                    interfaceC2579Bq.K1(DIRTY).writeByte(32).K1(str).writeByte(10);
                    interfaceC2579Bq.flush();
                    if (this.hasJournalErrors) {
                        return null;
                    }
                    if (entry == null) {
                        entry = new Entry(this, str);
                        this.lruEntries.put(str, entry);
                    }
                    Editor editor = new Editor(this, entry);
                    entry.setCurrentEditor$okhttp(editor);
                    return editor;
                }
                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                return null;
            }
            return null;
        }
        return null;
    }
}
