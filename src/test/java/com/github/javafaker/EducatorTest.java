/*
 * The MIT License
 * Copyright © 2018 Edwin Njeru
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.javafaker;

import org.junit.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class EducatorTest extends AbstractFakerTest {

    @Test
    public void testUniversity() {
        assertThat(faker.educator().university(), matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void testCourse() {
        assertThat(faker.educator().course(), matchesRegularExpression("(\\(?\\w+\\)? ?){3,6}"));
    }

    @Test
    public void testSecondarySchool() {
        assertThat(faker.educator().secondarySchool(), matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void testCampus() {
        assertThat(faker.educator().campus(), matchesRegularExpression("(\\w+ ?){1,2}"));
    }
}
