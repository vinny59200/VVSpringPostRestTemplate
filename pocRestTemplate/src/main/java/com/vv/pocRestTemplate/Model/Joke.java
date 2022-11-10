package com.vv.pocRestTemplate.Model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder( toBuilder = true )

public class Joke {

    private Long id;

    private String content;

}