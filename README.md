Motivation why we need threads ?
- Responsiveness - Concurrency
- Performance - Parallelism

Each thread have its own stack and instruction pointer
Context switch in threads is not cheap and is the price of multitasking(concurrency)

When we switch to different thread:
- we store the data of one thread
- restore the data of another thread
