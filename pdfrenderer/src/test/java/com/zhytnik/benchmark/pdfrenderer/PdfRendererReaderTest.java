package com.zhytnik.benchmark.pdfrenderer;

import com.zhytnik.benchmark.common.Reader;
import com.zhytnik.benchmark.test.ReaderTest;

import java.io.InputStream;

/**
 * @author Alexey Zhytnik
 * @since 26.08.2016
 */
public class PdfRendererReaderTest extends ReaderTest {
    @Override
    protected Reader<InputStream> getReader() {
        return new PdfRendererReader();
    }
}
